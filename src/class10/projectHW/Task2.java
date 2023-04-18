package class10.projectHW;

public class Task2 {
    /* Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
     */
    public static void main(String[] args) {
        int sum=0;
        int [] num={12,23,34,54,2};
        for (int i=0; i<num.length; i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }




    }


