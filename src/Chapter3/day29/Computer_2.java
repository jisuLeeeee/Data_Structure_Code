package Chapter3.day29;

public class Computer_2 {

    protected String manufacturer;
    protected String processor;
    protected int ramSize;
    protected int diskSize;
    protected double processorSpeed;

    public Computer_2(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
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
