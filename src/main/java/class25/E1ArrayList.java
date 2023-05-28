package class25;

import class16.Dog;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList=> a class already written(Its part of the collection's framework)
        <> thede are called angle brackets or diamond operators we write the name of the class who's
        objects we are planning to store in an arrayList
         */
        ArrayList<Car> cars=new ArrayList<>(); //creating arrayList of Car class
      //Dog dog=new Dog();
      //dogs.add(dog); shorter version is under
        //dogs.add(new Dog()); //creating an obj of dog class and storing it in arrayList
        Car car1=new Car("Toyota","Prius");// creating obj of car class and storing it in a variable car1
        Car car2 =new Car("Honda","Civic");
        Car car3=new Car("BMW","I7");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        for (Car c:cars){ // to print all cars
            c.printInfo();
        }


    }
}
class Car{
    String make;
    String model;
    Car(String make, String model){
        this.make=make;
        this.model=model;

    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}
