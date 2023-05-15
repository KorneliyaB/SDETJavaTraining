package class22;

public class FindNumber {
    //Create a method that will find a number from an array.
    public static int findNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }}

