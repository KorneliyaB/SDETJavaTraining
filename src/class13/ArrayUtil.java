package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int number = 89;
        int number1 = 12;

        ArrayUtil Arr=new ArrayUtil();
        Arr.searchArray(arr,number);
        Arr.searchArray(arr1,number1);
        /*
            for (int j = 0; j < arr.length; j++) {
                if (arr1[j] == number1) {
                    System.out.println("YES");
         */
    }
                   void searchArray(int [] arr, int number){
                       for (int i = 0; i < arr.length; i++) {
                           if (arr[i] == number) {
                               System.out.println("YES");
                               break;
        }
                }}}

