# Java로 배우는 자료구조

---

> **static 그리고 public 2**
>

- 접근제어
    - public : 클래스 외부에서 접근 가능
    - private : 클래스 내부에서만 접근 가능
    - default : 같은 패키지에 있는 다른 클래스에서 접근 가능
    - protected : 같은 패키지의 다른 클래스와 다른 프캐지의 하위클래스에서도 접근 가능(상속과 연관)
- 데이터 캡슐화
    - 모든 데이터 멤버를 private으로 만들고 필요한 경우에 public한 get/set 메소드를 제공
    - get/set 메소드를 구현하면 객체가 제공해주는 메소드를 통하지 않고서는 객체 내부의 데이터에 접근할 수 없음 ⇒ data encapsulation 혹은 information hiding