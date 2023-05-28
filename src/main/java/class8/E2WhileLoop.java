package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter any number");
        int num= input.nextInt();
        while (num!=-1){
            System.out.println("Please enter any number");
            num= input.nextInt();
        }
        System.out.println("Hello World");


    }
}
