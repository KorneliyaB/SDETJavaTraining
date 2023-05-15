package class21;

public class E1Poly {
    public static void main(String[] args) {

    Animal[] animals = new Animal[3];
    animals[0] = new Dog("Jack", "black", "German");
    animals[1] = new Cat("Tom", "blue", "Persian");
    animals[2] = new Horse("Spirit", "brown", "Arabian Horse");
    // we can do another way like under this line
       // class22.Animal[] animals = {new Dog("Jack", "black", "German"),
        //new Cat("Tom", "blue", "Persian"),
        //new Horse("Spirit", "brown", "Arabian Horse")};
        for (int i = 0; i < animals.length; i++) {
        animals[i].printInfo();
        animals[i].eat();
        animals[i].sleep();
        animals[i].speak();
    }
        Animal animal=new Dog("Jack", "black", "German");
        Dog d=(Dog)animal;
        d.run();
        int num=(int)10.5;


}}
