package day6;

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {

        // n개의 정수를 입력받아 순서대로 배열에 저장
        // 모든 정수들을 한 칸씩 오른쪽으로 shift하고 마지막 정수는 배열의 첫 칸으로 이동
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        int tmp = data[n-1]; //데이터 맨 마지막 값 저장
        for(int i=n-2; i>=0; i--){ // 배열을 거꾸로 탐색, 앞서 맨 마지막 값을 저장했기때문에 맨 마지막 -1 한 값부터 시작
            data[i+1] = data[i]; // 현재 위치한 곳의 다음위치에 현재 데이터를 저장
        }
        data[0] = tmp; // 기존에 저장한 마지막 값을 맨 처음 위치에 저장

        for(int i=0; i<n; i++){
            System.out.println(data[i]);
        }
    }
}
