package class10.HW;

public class Task5 {
    /* Create a 2D array or integer type and store
    numbers in 3 rows and 3 columns. Print the sum of all numbers.
     */
    public static void main(String[] args) {

    int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int num=0;
    for (int i=0;i<numbers.length; i++){
        for (int j=0; j<numbers[i].length; j++){
            num=num+numbers[i][j];
        }
    }
        System.out.println(num);

}}