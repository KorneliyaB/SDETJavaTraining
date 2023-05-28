package class12;

public class CarTester {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.make="Volkswagen";
        myCar.color="red";
        myCar.model="Tiguan";
        myCar.mileage=55876;
        myCar.mpg=29;

        myCar.honk();
        myCar.startCar();
        myCar.stop();



    }
}
