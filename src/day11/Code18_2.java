package day11;

import java.util.Scanner;

public class Code18_2 {
    public static void main(String[] args) {
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
    public static void bubbleSort(int n, int[] data) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1])// data[0]...data[i] 중 최대값 찾기
                    // swap data[j] and data[j+1]
                    swap(data[j], data[j+1]); // 값에 의한 호출로 정렬 구현은 이루어지지않음
            }
        }
    }
    static void swap(int a, int b){
        int tmp = a;
        a = b;// 더 큰 데이터로 교환
        b = tmp;
    }
}
