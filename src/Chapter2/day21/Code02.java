package Chapter2.day21;

import Chapter2.day20.Person1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
    // 데이터 파일에서 사람들의 이름과 전화번호를 입력받아 배열에 저장
    // 입력된 순서대로 출력

    // 메소드 외부에 선언하는 변수는 static 키워드 붙이기(당분간)
    static Person1[] members = new Person1[100];
    static int n = 0;
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("chap2_input.txt"));
            while( in.hasNext() ){ // 파일 끝에 도달할 때까지
                String name = in.next();
                String number = in.next();

                members[n] = new Person1();
                members[n].name = name;
                members[n].number = number;
                n++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("No data file");
        }

        for(int i=0; i<n; i++){
            System.out.println(members[i].name + " " + members[i].number);
        }

    }
}
