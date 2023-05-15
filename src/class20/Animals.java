package class20;

public class Animals {
    //Create 3 animal classes(Dog,Cat,Horse) create 3 methods in each class. create
    //3 fields and constructors as well in each class. Create the object of all 3 classes
    //and call 2 methods from each class. Yuo must use inheritance to avoid code duplication
     String name;//fields
     String color;
     int age;
     double weight;

    public Animals(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void eating(){System.out.println(name+" is eating");}//methods
     void sleep(){System.out.println(name+" is sleeping");}
     void running(){ System.out.println(name+" is running");}
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
class Dog extends Animals{
    public Dog(String name, String color, int age,double weight) {
        super(name, color, age, weight); }
@Override
    void sleep()
    { System.out.println("like to sleep 10.6h a day");

    }
}
class Cat extends Animals{
    public Cat(String name, String color, int age,double weight) {
        super(name,color,age,weight);
    }   }
class Horse extends Animals{
    Horse(String name, String breed, int age, double weight) {
        super(name, breed, age, weight);
    }
}
class AnimalsTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Eva","Black",2,15);
        //dog.printInfo();
        //dog.sleep();
        dog.sleep();

        Cat cat=new Cat("Biba","Black",1,23);
       // cat.running();
       // cat.sleep();

        Horse horse=new Horse("Boy","Brown",4,32);
       // horse.eating();
        //horse.printInfo();
    }
}

