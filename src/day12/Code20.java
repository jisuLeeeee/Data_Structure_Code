package day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
    // 이름을 알파벳 순으로 정렬하여 출력
    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int count = 0;
    public static void main(String[] args) {
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

        bubbleSort(); // count, name, number를 전역변수로 선언했으므로 인자값으로 넘겨줄 필요없음

        for(int i=0; i<count; i++)
            System.out.println(name[i] + ": " + number[i]);

    }

    static void bubbleSort(){
        for(int i=count-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(name[j].compareTo(name[j+1]) > 0){ // name[j] > name[j+1]
                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
