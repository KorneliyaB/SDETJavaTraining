package class13.HomeWork;

import java.util.Scanner;

public class task2 {
    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false
    public static void main(String[] args) {

        String pal1="aba";

        pal1 = pal1.toLowerCase();
        StringBuilder str = new StringBuilder(pal1);
        str.reverse();
        String newPalindrome = str.toString();
        if (pal1.equals(newPalindrome)) {
            boolean check = true;
            System.out.println(check);
        } else {
            System.out.println("false");
        }

        String pal2="Abbc";
        pal2 = pal2.toLowerCase();
        StringBuilder str1 = new StringBuilder(pal2);
        str.reverse();
        String newPalindrome1 = str.toString();
        if (pal2.equals(newPalindrome)) {
            boolean check = true;
            System.out.println(check);
        } else {
            System.out.println("false");
    }}}

