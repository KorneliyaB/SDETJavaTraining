package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the starting and ending number and step");
        int start= input.nextInt();
        int end= input.nextInt();
        int step= input.nextInt();
        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number=number+step; //number+=step
        }
    }
}
