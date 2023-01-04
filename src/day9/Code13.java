package day9;

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        // n개의 음이 아닌 정수를 입력받아 배열에 저장
        // 1개 이상의 연속된 정수들을 합하여 얻을 수 있는 소수들 중에 최대값 출력
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int val = 0;
                for(int k=i; k<=j; k++)
                    val = val * 10 + data[k]; // data[i]...data[k]를 하나의 정수로 환산
                boolean isPrime = true;
                for(int k=2; k*k <= val && isPrime; k++){
                    if(val % k == 0)
                        isPrime = false;
                }
                if(isPrime  && val > 1 && val > max)
                    max = val;
            }
        }
        if(max > 0)
            System.out.println(max);
        else
            System.out.println("No prime number");
    }
}
