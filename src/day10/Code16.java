package day10;

import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        //입력으로 두 정수 a와 b를 받아 a의 b승을 계산
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter two integers and press Enter.");

        int a = keyboard.nextInt();
        int b = keyboard.nextInt(); // 음이 아닌 정수

        int result = power(a,b); // 메소드 power 호출해서 result에 반환값 저장
        System.out.println("The result is " + result);
        keyboard.close();

    }
    public static int power(int n, int m){// 매개변수 n과 m의 정수를 받음
        int result = 1;
        for(int i=0; i<m; i++){
            result *= n; // n의 m승 계산
        }
        return result; // 자신을 호출한 곳에 값을 반환
    }
}
