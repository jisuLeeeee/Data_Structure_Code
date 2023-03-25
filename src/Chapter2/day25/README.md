# Java로 배우는 자료구조

---

> ****************메소드와 생성자 1****************
>
- 클래스는 서로 관련있는 데이터들 뿐만 아니라 *그 데이터와 관련이 깊은 메소드*도 함께 묶어둘 수 있음 ⇒ 코드의 *응집도*를 높이고 *결합도*를 낮춤
- Code06.java에서 사용된 메소드들 중 Term.java, Polynomial.java와 관련이 깊은 메소드를 찾아서 수정한 프로그램 작성 ⇒ Term2.java, Polynomial2.java, Code07.java

> ****************메소드와 생성자 2****************
>
- 생성자 : 클래스 안에서 해당 클래스와 동일한 이름을 가지며 return 타입이 없는 메서드
    - new 명령으로 객체가 생성될 때 자동으로 실행, 주 목적은 객체의 데이터 필드의 값을 초기화 하는것
- Term3.java ⇒ Term2.java와는 달리 생성자가 있어서 객체 생성과 초기화를 한번에 할 수 있음

    ```java
    class Term2 {
        public int coef, exp;
    }
    Term2 t2 = new Term2();
            t2.coef = 3;
            t2.expo = 2;
  
    
    class Term3{
        public int coef, exp;

        public Term3(int c, int e) {
            this.coef = c;
            this.exp = e;
        }
    }
  Term3 t3 = new Term3(3, 2);
    ```

- Polynomial3.java

    ```java
    class Polynomial3{
    		public int nTerms;
        public Term3[] terms;
    
        public Polynomial3() { // 기본 생성자
            nTerms = 0;
            terms = new Term3[100];
        }
    }
    ```