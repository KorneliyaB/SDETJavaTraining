package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        // Below cod helps us get any type of data from the console
        Scanner input=new Scanner(System.in);
        // it will print the text inside the "" in the console
        System.out.println("is it time for break true/false?");
        /*
        boolean isBreak => we are creating a variable of type boolean and
        calling is isBreak
        input=> is also a variable of type scanner
        nextBoolean()=> thia is a method that helps us take boolean type data from
        the keyboard
        = => equal to sign will store that value inside the isBreak variable
         */
        boolean isBreak=input.nextBoolean();
        /*
        if(isBreak) =>
         */
        if (isBreak){
            System.out.println("Let's have a break");
        } else {
            System.out.println("no break");
        }
    }
}
