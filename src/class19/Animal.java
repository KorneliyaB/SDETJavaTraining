package class19;

import class18.A;

public class Animal {
    // Create 3 classes like Dog Cat Horse define 5 properties(use default
// access level).
// You can use inheritance to avoid code duplication.
// Create one printInfo method that will print the values of these variables.
// create constructors as well in each child class to initialize those
// properties create one object of each class and call the printInfo method
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Animal(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age+" "+weight);
    }
}
class Dog extends Animal {
    double price;
    public Dog(String name, String breed, String color, int age,double weight,double price){
        super(name,breed,color,age,weight); // we are using 'super' keyword here in child class to reuse paren constr.
        this.price=price;
    }
    void printInfo(){
        super.printInfo();
            System.out.println(price);
        }
    }
class Cat extends Animal {
    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}
class Horse extends Animal {
    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class AnimalTester{



    public static void main(String[] args) {
        Dog dog=new Dog("Tom","Black","persian",10,20,2000);
        dog.printInfo();

    }
}
