package class18;

public class AnimalTester {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.color="black";
        System.out.println(horse.color);
        horse.eat();

        Cat cat=new Cat();
        cat.name="Mano";
        System.out.println(cat.name);
        cat.sleep();
        cat.speak();
    }
}
