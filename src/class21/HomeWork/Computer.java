package class21.HomeWork;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array.
    // Loop through each object and execute available methods.
    private final String model;
    private final int price;

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
}
void displayInfo(){
    System.out.println(" Model "+model);
    System.out.println(" Price "+price);
}
    public void turnOn(){
        System.out.println(" Turning on "+ model);
    }
    public void shutDown(){
        System.out.println("Shutting down "+model);
    }
}
class Apple extends Computer{
    String warranty;

    public Apple(String warranty, int price) {
        super("Apple", price);
        this.warranty = warranty;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty);
    }
    void useDellSupport() {
        System.out.println("Using Apple Support");
}
class Lenovo extends Computer{
        String serialNumber;

    Lenovo(String serialNumber, int price) {
        super("Lenovo", price);
        this.serialNumber = serialNumber;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Serial Number: " + serialNumber);
    }
    void useLenovoAssistant() {
        System.out.println("Using Lenovo Assistant");
    }
}}
class HP extends Computer{
    String processor;

    HP(String processor, int price) {
        super("HP", price);
        this.processor = processor;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Processor: " + processor);
    }
}
class Dell extends Computer{
    boolean foldable;

    public Dell(String model, int price, boolean foldable) {
        super("Dell", price);
        this.foldable = foldable;
    }


    public boolean isFoldable() {
        return foldable;
    }
}
