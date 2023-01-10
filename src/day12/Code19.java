package day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    // input.txt 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아
    // 배열에 저장하고 출력
    public static void main(String[] args) {

        String[] name = new String[1000];
        String[] number = new String[1000];
        int count = 0;

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            // file안에 데이터의 길이를 알 수 없으므로 for문 대신 while문 사용
            while(inFile.hasNext()){ // file 끝에 도달하면 false 리턴
                name[count] = inFile.next();
                number[count] = inFile.next();
                count++;
            }

            inFile.close(); // 스캐너 닫기

        } catch (FileNotFoundException e) {
            // 파일이 없을 경우의 처리할 실행문
            System.out.println("No File");
            return; // main 함수 종료 => 프로그램 종료
        }

        for(int i=0; i<count; i++)
            System.out.println(name[i] + ": " + number[i]);
    }
}
