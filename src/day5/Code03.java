package day5;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        String str = "Hello";
        String input = null;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please type a string: ");
        input = kb.next(); // 문자열 입력받음

        if(str.equals(input)) { // 미리 초기화한 문자열과 입력한 문자열 비교
            System.out.println("Strings match! :-)");
        }
        else {
            System.out.println("Strings do not match! :-(");
        }
    }
}
