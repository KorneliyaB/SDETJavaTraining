package class22;

public class Count {
    //create a method that will
    // count how many times the number is appearing in an array
    public static int countNum(int[] arr, int number) {
        int count = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] == number) {
                count++;
            }
        }
        return count;
    }
}
