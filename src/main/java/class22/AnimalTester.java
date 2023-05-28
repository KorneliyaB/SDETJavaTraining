package class22;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] animals={new Dog(),new Horse(),new Cat()};
        for (Animal animal:animals){
            animal.eat();
            animal.speak();
            animal.sleep();
        }

    }
}
