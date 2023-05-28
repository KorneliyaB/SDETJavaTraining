package class17;

import java.util.Scanner;

public class DogTester {


    public static void main(String[] args) {
       /* class17.Dog dog = new class17.Dog();
        dog.name = "Jack";
        dog.color = "Black";
        dog.breed = "German";
        dog.age=5;

        class17.Dog dog1 = new class17.Dog();
        dog1.name = "Sam";
        dog1.color = "brawn";
        dog1.breed = "Bulldog";
        dog1.age=7;

        class17.Dog dog3 = new class17.Dog();
        dog3.name = "Milka";
        dog3.color = "White";
        dog3.breed = "Poodle";
        dog3.age=4;

        class17.Dog dog4 = new class17.Dog();
        dog4.name = "Tim";
        dog4.color = "White";
        dog4.breed = "Shepherd";
        dog4.age=2;

        class17.Dog dog5 = new class17.Dog();
        dog5.name = "Lila";
        dog5.color = "White";
        dog5.breed = "Husky";
        dog5.age=6;

        dog.printInfo();
        dog1.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();*/
        // this part of code create the object of the
        // class =>new Dog("Jack","black","persian",12);


        Dog dog1=new Dog("Jack","black","persian",12);
        Dog dog2=new Dog("shaggy","white","Husky",8);
        Dog dog3=new Dog("Fluffy","pink","British",7);
        Dog dog4=new Dog("Papi","brown","Shepherd",5);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();

        Scanner scanner=new Scanner(System.in);

    }
}