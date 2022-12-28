package day6;

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {

        //사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 사용자로부터 입력받기
        int[] data = new int[n]; // 입력받은 정수 크기만큼 배열 생성

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt(); // n개의 데이터를 입력받기
        }
        kb.close();

        // max 변수를 0으로 초기화하면 data 배열의 데이터 중 음수가 있을 때 제대로 결과가 출력되지 않음
        // data 배열의 데이터로 초기화 해야함
        int sum = 0, max = data[0];
        for(int i=0; i<n; i++){
            sum += data[i]; // data 배열의 모든 데이터 합
            if(data[i] > max)
                max = data[i]; // data 배열의 최대값 찾기
        }
        System.out.println("The sum is " + sum + " and the maximum is " + max);
    }
}
