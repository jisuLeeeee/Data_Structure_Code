package Chapter2.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {
    // 데이터 파일로부터 사각형에 관한 정보를 읽어 배열 rects에 저장
    static MyRectangle1 [] rects = new MyRectangle1[100]; // 여러 개의 사각형에 대한 정보
    static int n = 0; // 읽은 사각형의 개수

    public static void main(String[] args) {
        try {
            Scanner source = new Scanner(new File("chap2_data.txt"));
            while(source.hasNext()) {
                rects[n] = new MyRectangle1();
                rects[n].le = new MyPoint1();
                rects[n].le.x = source.nextInt();
                rects[n].le.y = source.nextInt();
                rects[n].width = source.nextInt();
                rects[n].height = source.nextInt();

                n++;
            }
            source.close();
        }catch (FileNotFoundException e) {
            System.out.println("No data file exists.");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++){
            System.out.println(rects[i].le.x + " " + rects[i].le.y + " " + rects[i].width + " " + rects[i].height);
        }
    }
    private static void bubbleSort(){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(calcArea(rects[j]) > calcArea(rects[j+1])){
                    MyRectangle1 tmp = rects[j];
                    rects[j] = rects[j+1];
                    rects[j+1] = tmp;
                }
            }
        }
    }

    public static int calcArea( MyRectangle1 r){
        return r.width * r.height;
    }
}
