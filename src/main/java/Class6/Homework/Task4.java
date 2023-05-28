package Class6.Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Write a program for user to enter his/hers birth month. Based on the
        // month define the season.Example: if user is born in March, April, May → season =”Spring”
        // if user is born in June, July, August → season =”Summer” etc …At the
        // end of the program we should see 1 output as “You were born is season __”.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scan.nextLine();
        String season="";

        switch(month){
            case"December":
            case"January":
            case"February":
                season="Winter";
                break;
            case"March":
            case"April":
            case"May":
                season="Spring";
                break;
            case"June":
            case"July":
            case"August":
                season="Summer";
                break;
            case"September":
            case"October":
            case"November":
                season="Fall";
                break;

        }
        System.out.println("You were born in the season of " + season);




    }
}
