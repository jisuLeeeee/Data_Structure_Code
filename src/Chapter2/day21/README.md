# Java로 배우는 자료구조 강의

---

> **클래스, 객체, 참조변수 2**

```java
Person1 first = new Person1();
first.name = "John";
first.number = " 01038273823";

Person1 second = first; // first 객체의 주소 저장, 동일한 하나의 객체를 참조(공유)함
first.name = "Tom";

Person1[] members = new Person1[10];
members[0] = first;
members[1] = second;

// name필드는 Tom 출력
System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
```

<img width="346" alt="2-1-2" src="https://user-images.githubusercontent.com/120107671/227704235-ee988d88-d6ab-4b3e-8629-6be1442e44b2.png">


- second 객체가 first객체를 그대로 복사 할 경우 하나의 객체를 동시에 참조함
- 배열의 타입이 프리미티브 타입이면 배열의 원소는 프리미티브 타입이지만 배열 자체는 프리미티브 타입이 아니고, 배열의 타입이 프리미티브 타입이 아니면 배열의 원소 또한 참조변수임

> **클래스, 객체, 참조변수 3**
>
- 이름과 번호를 입력받고 사전순으로 정렬 - Chapter2.day21.Code03.java

| 구분 |  | Java                                                                |
| --- | --- |---------------------------------------------------------------------|
| 프리미티브 타입(int, double, char, float…) | 보통변수 | int a = 10; char ch = ‘x’;                                          
|
| 사용자 정의 타입(class) | 참조변수 | Person b; <br/>b = new Person(); <br/>b.name = “David”; <br/>b.number = “4563434”; |
- 입력한 한 단어의 등장 빈도를 출력 - Chapter2.day21.IndexMaker.java
