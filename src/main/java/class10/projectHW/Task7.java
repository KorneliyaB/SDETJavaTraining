package class10.projectHW;

public class Task7 {
    //Write a Java Program to print the first 10 numbers of
    //Fibonacci series.
    // The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        int num=10;
        int[] fib= new int[num];

        fib [0]=0;
        fib [1]=1;
        for (int i=2; i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];

        }
        for (int i=0;i<num;i++){
            System.out.print(fib[i]+" ");
        }

    }
}
