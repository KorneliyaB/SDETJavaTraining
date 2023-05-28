package class10.projectHW;

public class Task3 {
    /*  Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int [][] numbers={
                {1,24,3,37},
                {2,45,6,77},
                {9,6,13,18}
        };
        for (int i=0; i< numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();
        }

    }
}
