package day9;

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        // n개의 정수 입력받고 오름차순으로 정렬하여 출력
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j] > data[j+1]) {// data[0]...data[i] 중 최대값 찾기
                    int tmp = data[j];
                    data[j] = data[j+1];// 더 큰 데이터 교환
                    data[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted data");
        for(int i=0; i<n; i++)
            System.out.println(data[i]);
    }
}
