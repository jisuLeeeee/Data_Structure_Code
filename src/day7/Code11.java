package day7;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); // 정수 n 입력
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = kb.nextInt(); // n개의 정수 입력받아서 배열에 저장
        }
        kb.close();

        // 중복된 정수쌍의 개수를 카운트하여 출력
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(data[i] == data[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
