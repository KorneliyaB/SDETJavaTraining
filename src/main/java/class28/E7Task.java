package class28;

import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Please enter an int");
            scanner.nextInt();
        }catch (Exception e){
            System.out.println("wrong");
        }

    }
}
