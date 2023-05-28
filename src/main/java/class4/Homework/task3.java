package class4.Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //You are DMV representative and you need to ask customer their age.
        // If they are 18 and older you will issue a driver license to them,
        // otherwise you will offer them to get a learners permit.
        Scanner info=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=info.nextInt();
        if (age>=18){
            System.out.println("You will get driver license");
        }else {
            System.out.println("get a learner's permit");
        }
    }
}
