package Class6.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Write a program that will read three inputs of scores (quiz, mid term,
        // and final scores) and determine the grade based on the following rules:
        //if the average score >=90 → grade=A
        //if the average score >= 70 and <90 → grade=B
        //if the average score>=50 and <70 → grade=C
        //if the average score<50 → grade=F
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quiz points from 1 to 100");
        int quiz=scan.nextInt();
        System.out.println("Enter mid term points from 1 to 100");
        int midPoints=scan.nextInt();
        System.out.println("Enter final score from1 to 100");
        int finalS=scan.nextInt();
        int average=(quiz+midPoints+finalS)/3;

        if (average>=90){
            System.out.println("Your grade is A");
        }else if (average>=70 && average<90){
            System.out.println("Your grade is B");
        }else if (average>=50 && average<70){
            System.out.println("Your grade is C");
        }else if (average<50){
            System.out.println("Your gradr is F");
        }


    }
}
