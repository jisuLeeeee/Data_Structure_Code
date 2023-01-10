# Java로 배우는 자료구조 강의

---

> **메서드 호출과 프로그램의 기능적 분할3**
>
- input.txt 파일에서 사람들의 이름과 전화번호를 쌍으로 입력받아 배열에 저장하고 출력 [Code19.java]
    - Unhandled exception: java.io.FileNotFoundException

        ```java
        Scanner inFile = new Scanner(new File("input.txt"));
        ```

        - 파일이 발견되지 않는 예외에 대한 처리를 지정하지 않았다는 오류
        - try-catch문으로 예외 처리하기

    - Scanner가 제공하는 hasNext() 메소드는 “다음 가져올 데이터가 있으면 True, 없으면 False”를 반환

        ```java
        inFile.hasNext() // 파일의 끝에 도달했는지 검사
        ```


- input.txt 파일의 이름과 전화번호 쌍을 입력받은 후 이름의 알파벳 순서로 정렬하여 출력  [Code20.java]
    - bubbleSort() 메소드에서 알파벳순으로 정렬
        - 필요한 변수들을 전역변수로 선언해서 매개변수를 선언하지 않아도 됨
        - 정수 비교가 아닌 String을 사전식으로 비교할 때 .compareTo()를 사용해서 if(*`name*[j].compareTo(*name*[j+1])` > 0) ⇒ name[j]가 더 크면 양수를 반환, < 0 이면 name[j+1]이 더 크다는 뜻으로 음수를 반환