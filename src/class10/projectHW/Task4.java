package class10.projectHW;

import java.util.Scanner;

public class Task4 {
    /*  Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
     */
    public static void main(String[] args) {
        int[][] num={
                {1,24,3,37},
                {2,45,6,77},
                {9,6,13,18}
        };
        int even=0;
        int odd=0;
        int number; //declaring number

        for (int i=0; i< num.length; i++){
            for (int j=0;j< num[i].length; j++){
                number=num[i][j];
                if (number%2==0){
                    even=even+number;
                } else { //or (number%2!=0)
                    odd=odd+number;
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

}
