package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean [][]arr2D={
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int count=0;
        for (boolean []arr1:arr2D) {
            for (boolean arr : arr1) {
                if (arr == true) {
                    count ++;
                }
            }
        }
        System.out.println(count);
        }
    }

