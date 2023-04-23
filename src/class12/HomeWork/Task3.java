package class12.HomeWork;

import java.util.Scanner;

public class Task3 {
    //Write a program that reads two people's first
    //names and if they expecting boy or girl?
    //Based on the input suggests a name for a baby:
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? boy
    //Suggested baby name: DANRY
    //
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? girl
    //Suggested baby name: MAIEL
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your mom's first name");
        String momname=scan.nextLine();
        System.out.println("Please enter your dad's first name");
        String dadname=scan.nextLine();
        System.out.println("What is the gender expected?");
        String gender=scan.nextLine();

        if(gender.equals("boy")){
            System.out.println("Suggested baby name: DANRY");
        }else {
            System.out.println("Suggested baby name: MAIEL");
        }
    }
}
