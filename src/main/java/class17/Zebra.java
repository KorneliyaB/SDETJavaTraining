package class17;

public class Zebra {
    String name;
    String color;
    int age;
    double weight;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printIno(){
        System.out.println(name+" "+color+" "+age+" "+weight); //instance
    }
   static void speak(){
        System.out.println("mooo boahhha");

    }
}

