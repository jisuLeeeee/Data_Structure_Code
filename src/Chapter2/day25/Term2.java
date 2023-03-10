package Chapter2.day25;

public class Term2 {
    // 다항식을 구성하는 하나의 항을 표현하기 위한 클래스
    // 계수(coef)는 정수, 차수(exp)는 음이 아닌 정수
    public int coef, exp;

    public int calcTerm(int x) {

        return (int)(coef * Math.pow(x, exp));
    }

    public void printTerm() {
        System.out.print(coef + "x^" + exp);
    }
}
