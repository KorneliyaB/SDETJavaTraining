package Practise;

public class P7 {
    ////Write a java program to check whether a given
    //    number is prime or not?
    //    1. number should be >1
    //    2. num should be divisible by itself only
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is a Prime number ");
        } else {
            System.out.println("It is not a prime number ");
        }
    }
}
