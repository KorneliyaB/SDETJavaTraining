package class20;

public class Parent {
    void getMerry(){
        System.out.println("Marry to the girl of our choice");
    }
}
class Axel extends Parent{

    @Override
    void getMerry() {
        System.out.println("I want to merry Karol G");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMerry();
    }
}