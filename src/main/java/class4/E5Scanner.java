package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        /*
        - Scanner => is a class (which know how to take input from the keyboard)
        - scan is a variable of type scanner just like we create a variable of type String, can
        be any name
        - new => is special keyword which is create the object of a class
        - Scanner again with ()
        - System.in => means we went to use the scanner class for taking the user input
         */
        // whenever we need to take the input from the user we need this code
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scan.next();
        System.out.println("You are amazing "+name);
        System.out.println("Please enter your last name");
        String lastName=scan.next();
        System.out.println("Full name is "+name+ " " +lastName);


    }
}
