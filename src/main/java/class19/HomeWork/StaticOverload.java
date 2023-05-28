package class19.HomeWork;

public class StaticOverload {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static void addition(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void addition(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void addition(double num1,double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        addition(5,5);
        addition(5,5.5);
        addition(5.5,5.5);
    }
}
