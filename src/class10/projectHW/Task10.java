package class10.projectHW;

public class Task10 {
    //Write a program to print out duplicate elements from
    //an Array of Strings?
    public static void main(String[] args) {
        String[] element = {"Tom", "Nelly", "Kate", "Tom","Vicky"};

        // Create an array to store the frequency of each string
        int[] repeat = new int[element.length];

        for (int i = 0; i < element.length; i++) {
            for (int j = i + 1; j < element.length; j++) {
                if (element[i].equals(element[j])) {
                    repeat[i]++;
                }

            }
        }
        for (int i = 0; i < repeat.length; i++) {
            if (repeat[i] > 0) {
                System.out.println(element[i] + " ");

            }

        }
        System.out.println();
    }}
