package Chapter2.day21;

import Chapter2.day20.Person1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {
    // 이름과 번호를 입력받아 사전순으로 정렬

    static Person1[] members = new Person1[100];
    static  int n = 0;
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
            System.exit(1);
        }

        bubbleSort(); // 사용할 변수가 전역 변수이므로 매개변수 생성 X
        for(int i=0; i<n; i++){
            System.out.println(members[i].name + " " + members[i].number);
        }
    }
    private static void bubbleSort(){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(members[j].name.compareTo(members[j+1].name) > 0){ // compare names of j and (j+1) person
                    // swap two persons
                    Person1 tmp = members[j];
                    members[j] = members[j+1];
                    members[j+1] = tmp;
                }
            }
        }
    }
}
