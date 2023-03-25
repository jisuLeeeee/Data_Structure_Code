package Chapter2.day27;

public class Polynomial3 {
    public char name;
    public int nTerms; // 다항식을 구성하는 항의 개수
    public Term3[] terms; // 항들을 저장할 배열

    public Polynomial3() {
        nTerms = 0;
        terms = new Term3[100];
    }

    public Polynomial3(char n) {
        nTerms = 0;
        terms = new Term3[100];
        name = n;
    }
    public void addTerm(int c, int e) {
        // 같은 차수가 있는지 확인
        int index = findTerm(e);
        if(index != -1){
            terms[index].coef += c; // 계수가 0이 되는 예외는 구현하지 않음(0이 될 경우 해당 차수를 삭제)
        }
        else {
            int i = nTerms-1;
            while(i >= 0 && terms[i].exp < e){ // 항 정렬
                terms[i+1] = terms[i];
                i--;
            }
            terms[i+1] = new Term3(c, e);
            nTerms++;
        }
    }
    public int calcPolynomial(int x) {
        int result = 0;
        for(int i=0; i<nTerms; i++){
            result += terms[i].calcTerm(x);
        }
        return result;
    }

    public void printPolynomial() {
        for(int i=0; i<nTerms; i++){
            terms[i].printTerm();
            System.out.print("+");
        }
        System.out.println();
    }

    public int findTerm(int e) {
        for(int i = 0; i<nTerms && terms[i].exp >= e; i++){
            if(terms[i].exp == e)
                return i;
        }
        return -1;
    }
}
