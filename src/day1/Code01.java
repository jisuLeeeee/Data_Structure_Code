package day1;
public class Code01 {
    static int num; // 클래스 내부, 메소드 외부 변수

    public static void main(String[] args){
        int anotherNum = 5; // 메소드 내부 변수
        num = 2;

        System.out.println(num + anotherNum); // 25
        System.out.println("Num: " + num); // 2
        System.out.println("AnotherNum: " + anotherNum); // 5
        System.out.println("Sum: " + num + anotherNum); // 25
        System.out.println("Sum: " + (num + anotherNum)); // 7
    }
}
