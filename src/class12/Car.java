package class12;

public class Car {
    String make;
    String color;
    int year;
    String model;
    double mpg;
    int mileage;
    boolean isAutomatic;


    void stop(){
        System.out.println("Applying the break to stop the car...");
    };
    void honk(){
        System.out.println("Beep beep...");
    };
    void startCar(){
        System.out.println("Starting " +model+"  car...");
    };

}
