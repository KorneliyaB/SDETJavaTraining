package class26.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TAsk4 {
    public static void main(String[] args) {
        var findSum = new ArrayList<>(Arrays.asList(1, 3, 3, 1, 8, 4, 4));
        int sum = 0;
        for (var s : findSum) {
            sum += s;
        }
        System.out.println(sum);
    }
}
/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers

 */
