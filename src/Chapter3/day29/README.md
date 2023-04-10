# Java로 배우는 자료구조

---

> **********상속 2**********
>
- 메소드 오버라이딩
    - Computer_2 클래스의 toString()에는 Notebook_2 클래스의 변수 screenSize와 weight가 출력되지않아 서 Notebook_2 클래스에 super 클래스 메소드 toString()을 오버라이딩해서 호출
    - Computer_2 클래스(부모) 기존의 public으로 선언된 변수를 private으로 변경하면 Notebook_2 클래스(자식)에서 해당 변수는 오류 발생
        - protected으로 수정 ⇒ 상속받은 하위 클래스(Notebook_2)에서 사용 가능

> **********상속 3**********
>
- **다형성(Polynorphism)** : *super 클래스 타입의 변수가 서브클래스 타입의 객체를 참조할 수 있음*

Computer theComputer = new Notebook(”Bravo”, “Intel”, 4, 240, 2/4, 14.07.5);

- Computer 타입의 변수 theComputer가 Notebook 타입의 객체를 참조하고 있음

System.out.println(theComputer.toString());

- Computer, Notebook 클래스 둘 다 toString()를 가지고 있는데 어떤 클래스의 toString()이 실행될까? ⇒ **동적 바인딩(dynamic binding)**이 일어나서 Notebook 클래스의 toString()이 실행됨

> **********예제(Scheduler Program) 1, 2**********
>
1. 일회성 이벤트, 기간이 지정된 이벤트, 데드라인이 있는 이벤트의 클래스를 만들고 각각 필요한 멤버들을 생성
2. Chapter3.day29.OneDayEvent, DurationEvent, Deadlined 클래스의 공통 변수인 title을 Event 클래스의 멤버 변수로 생성 후 Event 클래스를 상속
3. Event 클래스에 parameter를 가진 생성자가 있으므로 서브 클래스 생성자에 super(title) 호출
4. addevent, list, show…등의 명령어와 이벤트 종류를 입력받음
5. 날짜를 입력받고 MyDate 클래스에 /로 구분하는데 split()사용해서 년도, 월, 일을 구분
    1. “//s+” ⇒ 여러 개의 공백문자 뿐만 아니라 줄바꿈이나 Tab 공백까지도 포함(정규표현식)
6. 서로 다른 타입의 데이터들(상속받은 자식 클래스들)을 하나의 배열(Event 부모 클래스)에 저장
7. 배열 재할당(Array Reallocation)으로 기존의 배열 객체의 크기를 늘림

    ```java
    public class Scheduler {
    int capacity = 10;
    public Event[] events = new Event[10];
    
    	private void rellocate() {
    	        Event[] tmp = new Event[capacity * 2];
    	        for(int i=0; i<n; i++){
    	            tmp[i] = events[i];
    	        }
    	        events = tmp;
    	        capacity *= 2;
    	    }
    }
    ```