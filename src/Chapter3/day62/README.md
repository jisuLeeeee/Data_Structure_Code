# Day62

---

### <2023-06-20>

> **********************************************************JAVA로 배우는 자료구조 - 클래스 Object와 Wrapper 클래스**********************************************************
>
- class Object
    - **Java에서 모든 클래스의 superclass임**
    - Java의 모든 클래스는 내가 만들어 주지 않아도 이미 equals와 toString 메소드를 가지고 있음
        - boolean equals(Object obj)
        - int hashCode()
        - String toString()
        - class<?> getClass()
- Wrapper class
    - Java에서 primitive type 데이터와 non-primitive type 데이터 즉, 객체는 근본적으로 다르게 처리됨
    - Object 타입의 배열에는 다형성의 원리에 의해 모든 종류의 객체를 저장할 수 있지만, int/double/char 등의 primitive type 데이터는 객체가 아니므로 저장할 수 없음
    - 때때로 primitive type 데이터를 객체로 만들어야 할 경우가 있는데 이 때는 **Integer, Double, Character** 등의 wrapper class를 이용함

    ```java
    Object[] theArray = new Object[100];
    theArray[0] = 10; // 10은 정수이지만 Java에서 컴파일러가 자동으로 Interger 객체로 변환해줌
    // 이것을 autoboxing이라고 함
    
    int a = (Integer)theArray[0]; // theArray[0]에 저장된 것은 Integer 객체이지만 Java 컴파일러가 자동으로 정수로 변환해줌
    // 이것을 unboxing이라 함
    
    ```