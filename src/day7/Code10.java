package day7;

public class Code10 {
    public static void main(String[] args) {
        // 1~100000 사이의 모든 소수들을 찾아서 출력

        for(int n=2; n<=100000; n++) {
            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) { // not prime => 소수가아님
                    isPrime = false;
                    break; // 만약 짝수이면 소수가 아닐테니 for문을 더는 실행하지 않아도 되기에 break로 for문 빠져나오기
                }
            }
            if (isPrime)
                System.out.println(n);
        }
    }
}
