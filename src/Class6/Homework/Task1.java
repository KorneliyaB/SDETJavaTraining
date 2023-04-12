package Class6.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Ask user to enter a number and then define if number is small, medium or large
        //Small number is value between 1 and 10
        //Medium number is value between 11 and 100
        //Large number is value between 101 and 1000
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number from 1 to 1000");
        int number= scanner.nextInt();
        if (number>=1 && number<=10){
            System.out.println("Small number");
        }else if (number>=11 && number<=100){
            System.out.println("Medium number");
        }else if (number>=101 && number<=1000){
            System.out.println("Large number");
        }
    }
}
