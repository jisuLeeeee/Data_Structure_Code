package Chapter2.day20;

public class Code01 {
    public static void main(String[] args) {
        Person1 first; // Person1 클래스 => 변수의 타입
        first = new Person1(); // Person1 타입의 객체 생성

        first.name = "John"; // first 객체의 필드에 데이터 저장
        first.number = " 01038273823";

        // first가 가리키는 Person1 객체의 name, number 필드 출력
        System.out.println("Name: " + first.name + ", Number: " + first.number);

        Person1[] members = new Person1[10]; // 배열 생성
        members[0] = first;
        members[1] = new Person1(); // 새로운 데이터를 저장할 경우 해당 인덱스에 클래스 타입의 객체 생성
        members[1].name = "David";
        members[1].number = "383450397";
        System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
    }
}
