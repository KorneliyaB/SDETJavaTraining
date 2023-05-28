package class10.projectHW;

public class Task5 {
    //Write a program to swap 2 numbers without a
    //temporary variable?

    public static void main(String[] args) {
        int x=3;
        int z=6;
        //before swapping
        System.out.println("x="+x);
        System.out.println("z="+z);
        x=x+z; //9
        z=x-z; //3
        x=x-z;//6
        //after swapping
        System.out.println();

        System.out.println("x="+x);
        System.out.println("z="+z);
    }
}
