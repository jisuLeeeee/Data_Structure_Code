package Chapter2.day21;

import Chapter2.day20.Person1;

public class Code01_2 {
    public static void main(String[] args) {
        Person1 first = new Person1();

        first.name = "John";
        first.number = " 01038273823";
        System.out.println("Name: " + first.name + ", Number: " + first.number);


        Person1 second = first; // first 객체의 주소 저장, 하나의 객체를 공유함
        first.name = "Tom";
        System.out.println("Name: " + second.name + ", Number: " + first.number);

        Person1[] members = new Person1[10];
        members[0] = first;
        members[1] = second;
        System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
        System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
    }
}
