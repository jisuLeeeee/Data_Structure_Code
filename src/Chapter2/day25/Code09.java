package Chapter2.day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {
    // 데이터 파일로부터 사각형에 관한 정보를 읽어 배열 rects에 저장
    static MyRectangle2[] rects = new MyRectangle2[100]; // 여러 개의 사각형에 대한 정보
    static int n = 0; // 읽은 사각형의 개수

    public static void main(String[] args) {
        try {
            Scanner source = new Scanner(new File("chap2_data.txt"));
            while(source.hasNext()) {
                int x = source.nextInt();
                int y = source.nextInt();
                int width = source.nextInt();
                int height = source.nextInt();

                rects[n] = new MyRectangle2(x, y, width, height);

                n++;
            }
            source.close();
        }catch (FileNotFoundException e) {
            System.out.println("No data file exists.");
            System.exit(1);
        }

        bubbleSort();

        for(int i=0; i<n; i++){
            System.out.println(rects[i].toString());
        }
    }
    private static void bubbleSort(){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(rects[j].calcArea() > rects[j+1].calcArea()){
                    MyRectangle2 tmp = rects[j];
                    rects[j] = rects[j+1];
                    rects[j+1] = tmp;
                }
            }
        }
    }
}
