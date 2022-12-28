package day6;

public class Code05 {
    public static void main(String[] args) {

        int [] grades; // 정수형 배열 선언
        grades = new int[5]; // 배열 크기 지정하면서 생성, 실제 배열이 만들어지는 시점

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 90;
        grades[3] = 95;
        grades[4] = 14;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
    }
}
