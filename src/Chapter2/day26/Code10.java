package Chapter2.day26;

import Chapter2.day25.MyPoint2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("chap2_input.txt"));
            int n = in.nextInt();
            OrthoPolygon thePolygon = new OrthoPolygon(n); // 꼭짓점 개수를 입력받아 다각형 생성
            for(int i=0; i<n; i++)
                thePolygon.addVertex(in.nextInt(), in.nextInt()); // 꼭짓점 좌표를 시계방향 순으로 입력받아서 다각형에 추가
            MyPoint2 thePoint = new MyPoint2(in.nextInt(), in.nextInt()); // 테스트할 점의 좌표 입력받음
            in.close();
            if(thePolygon.contains(thePoint)) // 내부인지 외부인지 검사
                System.out.println("Yes");
            else
                System.out.println("No");
        }catch (FileNotFoundException e){
            System.out.println("No data file exists.");
            System.exit(1);
        }
    }
}
