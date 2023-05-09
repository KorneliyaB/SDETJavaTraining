package class17;

public class Cat {
 String name;
 Cat(String catNAme){
     System.out.println("1argument");
 }
 /*Not allowed as we already have a constructor that takes a String vale
 Cat(String color){
     System.out.println("hdghdbhbv");
 }
 */

 Cat(double weight){
     System.out.println("Double argument constructor");
 }
 Cat (int age){
     System.out.println("int argument constructor");
 }
 Cat(){
     System.out.println("0 argument constructor called");
 }
  void printInfo(){
      System.out.println(name);
}


    public static void main(String[] args) {
        Cat cat=new Cat(10.5);// default constructor
       // cat.printInfo();
    }
}
