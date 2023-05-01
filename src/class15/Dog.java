package class15;

public class Dog {
    String name;
    String color;
    int age;
    static int noLegs=4;
  static String planetName="Earth";
  //static int weight;

    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.color="green";
        //dog.weight=20;


        Dog dog1 =new Dog();
       // System.out.println(dog1.weight);//static
        System.out.println(dog1.color); //instance
    }

}
