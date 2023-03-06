package Chapter2.day24;

public class Polynomial {
    // 하나의 다항식을 표현하기 위한 클래스
    public char name; // 다항식 이름( f, g ...)
    public int nTerms = 0; // 다항식을 구성하는 항의 개수
    public Term[] terms; // 항들을 저장할 배열
}
