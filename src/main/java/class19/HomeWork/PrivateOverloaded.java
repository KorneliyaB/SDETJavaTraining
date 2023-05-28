package class19.HomeWork;

public class PrivateOverloaded {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private static void info(String n1, String n2){
        System.out.println(n1+" "+n2);
    }
    private static void info(String n1, int n2){
        System.out.println(n1+" "+n2);
    }
    private static void info(int n1,int n2){
        System.out.println(n1+" "+n2);
    }

    public static void main(String[] args) {
        info("Tom","James");
        info("Smith",25);
        info(5,6);

    }
}
