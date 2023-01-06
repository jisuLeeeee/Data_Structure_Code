package day10;

public class Code17 {
    public static void main(String[] args) {
        // 1~100000 사이에 소수를 찾아서 출력
        for(int i=2; i<=100000; i++){
            if(isPrime(i)) // isPrime 메소드 호출
                System.out.println(i);
        }
    }
    static boolean isPrime(int k){
        if(k<2) return false;

        for(int i=2; i*i<=k; i++){
            if(k % i == 0)
                return false;
        }
        return true;
    }
}