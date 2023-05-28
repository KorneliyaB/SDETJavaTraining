package class12;

import java.util.SplittableRandom;

public class E1StringDemo {
    public static void main(String[] args) {
        //create the object of that class
        String string=new String("Ana");
        String string1="Ana"; //shortcut for previous line, most widely used
        System.out.println(string1.length());// there are 3 letters in Ana. output 3

        String name="Nelly";
        if (name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }



    }
}
