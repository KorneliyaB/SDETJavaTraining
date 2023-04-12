package Class6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //Prompt the user to enter person heights in inches.
        // Person should be classified as one of the following:
        //• short (under 60 inch)
        //• medium(between 60 -72 inch)
        //• tall (over 72 inch)

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        int height=input.nextInt();
        if (height<60){
            System.out.println("Short");
        }else if (height>=60 && height<=72){
            System.out.println("Medium");
        } else if (height>72){
            System.out.println("Tall");
        }

    }
}
