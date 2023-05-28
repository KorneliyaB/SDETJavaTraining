package class7;

import java.util.Scanner;

public class EWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number grater than 1");
        int number=scan.nextInt();
        int num=1;
        while (num<=number){
            System.out.print(num+ " ");
            num++;
        }
    }
}
