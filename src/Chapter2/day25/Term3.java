package Chapter2.day25;

public class Term3 {
    public int coef, exp;

    public Term3(int c, int e) {
        this.coef = c;
        this.exp = e;
    }

    public int calcTerm(int x) {

        return (int)(coef * Math.pow(x, exp));
    }

    public void printTerm() {
        System.out.print(coef + "x^" + exp);
    }
}