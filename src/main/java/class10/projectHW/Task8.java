package class10.projectHW;

public class Task8 {
    //. Maximum and minimum number in the array?
    public static void main(String[] args) {
        int[] numbers= {12,35,18,83,11,5};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }else if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("The max number is "+max);
        System.out.println("The min number is "+min);

    }
}
