package class10.projectHW;

import java.util.Scanner;

public class Task6 {
    //Write a java program to check whether a given
    //number is prime or not?
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int number=input.nextInt();
        boolean prime=false;

        if (number<2){
            System.out.println(number + " is not a prime number");
        }else {
            for (int i=2;i<=number/2;i++){
                if (number%i==0){
                    prime=true;
                }
            }
            if(!prime){
                System.out.println(number + " is a prime number");
            }else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
