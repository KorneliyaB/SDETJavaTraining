package class18;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{
    //String color="white";
    void printColor(){
        String color="Blue";
        System.out.println(color);// local var. always printed first..that is why output blue
        System.out.println(this.color); //if we use 'this' keyword output white , because it prints instance var
        System.out.println(super.color);// using 'super.' keyword output is black parent class will be printed
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}