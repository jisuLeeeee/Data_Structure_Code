package Chapter3.day28_2;

public class Computer {

    // 멤버 변수들의 접근제한자는 private으로 해야하지만 강의 순서의 흐름상 public으로 설정
    public String manufacturer;
    public String processor;
    public int ramSize;
    public int diskSize;
    public double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }

    public double computerPower(){
        return ramSize * processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public String toString(){
        String result = "Manufacturer: " + manufacturer +
                        "|nCPU: " + processor +
                        "|nRAM: " + ramSize + " megabytes" +
                        "|nDisk: " + diskSize + " gigabytes" +
                        "|nProcessor speed: " + processorSpeed + " gigahertz";
        return result;
    }
}
