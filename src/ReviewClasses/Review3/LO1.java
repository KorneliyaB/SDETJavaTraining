package ReviewClasses.Review3;

public class LO1 {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginClickable=false;

        if (loginButtonDisplayed || loginClickable){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Buy";

        if (!str.equals("Hello")){
            System.out.println("String is Not hello");

        }
    }
}
