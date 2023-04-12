package Class5;

public class E4NestedIf {
    public static void main(String[] args) {

        /*
        create a variable money store the vale 20000 inside that variable
        write if-else , if money is grater than 10000 program should check another
        condition for example it should check what day is today. if the day is Sunday it
        should say lets shopping
         */
        int money = 5000;
        String day = "Monday";
        if (money > 10000) {
            if (day.equals("sunday")) {
                System.out.println("Let's go for shopping");
            } else {
                System.out.println("Let's wait for Sunday");
            }
        }else{
            System.out.println("Let's save more");
        }
    }
}
