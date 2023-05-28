package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;


    Car(String make,String model,int engineCC,String color){
        //preferred way to use the same name of parameters and same instance variable with
        // "this" keyword

        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;

    //Car(String carMake,String carModel,int carEngineCC,String carColor){
       // make=carMake; //always has to be different name of parameters and instance variables
       // model=carModel;
       // engineCC=carEngineCC;
       // color=carColor;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","civic",1800,"black");
        car.printInfo();

    }

}
