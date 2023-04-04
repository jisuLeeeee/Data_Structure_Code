package Chapter3.day28_2;

public class Notebook extends Computer{

    // 멤버 변수들의 접근제한자는 private으로 해야하지만 강의 순서의 흐름상 public으로 설정
    public double screenSize;
    public double weight;

    public Notebook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double screenSize, double weight) {
        super(manufacturer, processor, ramSize, diskSize, processorSpeed);

        this.screenSize = screenSize;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);

        System.out.println(test.computerPower());
    }
}
