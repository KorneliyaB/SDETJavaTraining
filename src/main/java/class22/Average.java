package class22;

public class Average {
    public static double average(int[] arr) {
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            sum += arr[y];
        }
        return (double) sum / arr.length;
    }
}
