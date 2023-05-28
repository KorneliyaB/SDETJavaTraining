package class23;

public interface SellAble {
    // private int PRICE = 12000; => private access modifier NOT allowed
    //protected nt PRICE = 12000; => not allowed
    int PRICE =12000; // in interface has to be uppercase like PRICE

    //final abstract void sell(); final not allowed as methods are abstract by default

    static void sell(){
        System.out.println("Allowed");

    }
}
class Tester1{
    public static void main(String[] args) {
        SellAble.sell();
    }
}
