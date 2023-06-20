package Chapter3.day62;

public class Test {
    public int a = 10;
    public double x = 1.23;

    /*public String toString(){
        return a + " " + x;
    }*/

    /*public  boolean equals(Test other){ // Java 클래스는 equals(Object obj)이기 때문에 매개변수가 다르므로 method overriding이라고 볼 수 없음
        return a == other.a && x == other.x;
    }*/

    public  boolean equals(Object other){ // method overriding
        Test other2 = (Test)other; // 타입 캐스팅

        return a == other2.a && x == other2.x;
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        //test2.a = 5;
        //test2.x = 1.2387497;
        System.out.println(test1.toString()); // 문법적 오류 X, toString() method overriding 않으면 객체의 hash codee 출력

        if(test2.equals(test1))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
