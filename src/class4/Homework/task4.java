package class4.Homework;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and print
        // “The temperature is the city is ”
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of the city");
        String city= scanner.next();
        System.out.println("Enter currant temperature in Fahrenheit");
        int temperatureF=scanner.nextInt();
        int temperatureC=((temperatureF-32)*5/9);
        System.out.println("The temperature in the "+city+" is "+temperatureC+" C");
    }
}
