package class10.projectHW;

public class Task9 {
    //Write a java program to find the second largest
    //number in the array?
    public static void main(String[] args) {
        int[] numbers={25,65,15,3,11};

        int large=numbers[0];
        int largeSecond=numbers[0];

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]>large){
                large=numbers[i];
            }else if (numbers[i]>largeSecond && numbers[i]<large){
                largeSecond=numbers[i];
            }
        }
        System.out.println("Largest number "+ large);
        System.out.println("Second largest number "+largeSecond);

    }
}
