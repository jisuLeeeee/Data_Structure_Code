package day2;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args){
        int number = 123;
        Scanner keyboard = new Scanner(System.in); // keyboard라는 객체 생성

        System.out.print("Please enter an integer: "); // 질문

        int input = keyboard.nextInt(); // 키보드로 위의 질문에 대한 답을 입력

        if(input == number){// 입력한 숫자와 미리 초기화한 number가 같다면
            System.out.println("Number match! :-)"); // 매치된 메시지를 띄움
        } else{
            System.out.println("Numbers do not match! :-("); // 매치되지 않았다는 메시지를 띄움
        }
    }
}
