package day11;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        // 입력받은 n개의 정수를 오름차순으로 정렬

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // main 함수 안에 선언된 변수이므로 bubbleSort 메소드에서 사용 불가
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        bubbleSort(n, data); // 버블 정렬하는 메소드 호출

        System.out.println("Sorted data: ");
        for(int i=0; i<n; i++)
            System.out.println(data[i]);
    }

    static void bubbleSort(int n, int[] data){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j] > data[j+1]) {// data[0]...data[i] 중 최대값 찾기
                    // swap data[j] and data[j+1]
                    int tmp = data[j];
                    data[j] = data[j+1];// 더 큰 데이터 교환
                    data[j+1] = tmp;
                }
            }
        }// 아무것도 return하지 않지만 메소드가 수행한 것은 배열 data에 반영되어있음
    }
}
