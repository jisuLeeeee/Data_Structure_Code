package Chapter3.day29;

public class Notebook_2 extends Computer_2 {

    public double screenSize;
    public double weight;

    public Notebook_2(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double screenSize, double weight) {
        super(manufacturer, processor, ramSize, diskSize, processorSpeed);

        this.screenSize = screenSize;
        this.weight = weight;
    }

    public String toString(){ // 메소드 오버라이딩에서 중복되는 부분은 super.메소드
        String result = super.toString() +
                "\nScreen Size: " + screenSize + " inches" +
                "\nWeight: " + weight + " kg";

        return result;
    }

    public static void main(String[] args) {
        Computer_2 test = new Notebook_2("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);

        System.out.println(test.computerPower());
        System.out.println(test.toString()); // static binding vs dynamic binding
    }
}
