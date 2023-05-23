package class21;




class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("class22.Animal speak");
    }
    void sleep(){
        System.out.println("Aniaml sleep from 1 to 20 h a day");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("meow....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");
    }
    @Override
    void sleep(){
        System.out.println("CAts like to sleep 15 h");
    }
    void run(){
        System.out.println("cat run fast");
    }

}
public class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof...");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8h");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bons");
    }
    void run(){
        System.out.println("Dog run fast");
    }
}
class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }
    @Override
    void eat(){
        System.out.println("horses like carrots,grass");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Bill","black","German");
        dog.printInfo();
        //Parent class variables can store the object of the child classes
        Animal  dog1=new Dog("shaggy","white","german");
        dog1.printInfo();

        Animal [] animals={new Dog("shaggy","white","german"),new Cat("Tom","blue","persian")};

        for (Animal animal:animals){
            animal.printInfo();
        }
        // type casting(widening)
        double d=10;
        Animal dog2=new Dog("hdf","black","dshbf");

        int g=(int)10.5;
       // Dog dog3=(Dog)new Animal("shaggy","white","german"); //this not allowed
    }
}
