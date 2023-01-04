package day9;

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        // n개의 정수 입력받고 정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬해서 출력
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            int tmp = kb.nextInt();
            int j = i-1;
            while(j>=0 && data[j] > tmp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = tmp; // tmp보다 작은 값을 만났을 때

            for(int k=0; k<i+1; k++)
                System.out.print(data[k] + " ");
            System.out.println();
        }
        kb.close();


    }
}
