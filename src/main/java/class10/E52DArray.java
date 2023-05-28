package class10;

public class E52DArray {
    public static void main(String[] args) {
        int[][] matrix={
                {10 ,20,30,40,50},
                {20 ,50 ,65,20},
                {102, 54,60},
                {20,55}
        };
        for (int i = 0; i < matrix.length; i++) {
            //int [] arr=matrix[i]=> will return the
            // complete 1D array at the index specified by the value of row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
