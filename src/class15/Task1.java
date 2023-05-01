package class15;

public class Task1 {
    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr

    int sumArr(int []arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int [] array={10,10,10};
        int result= task1.sumArr(array);
        System.out.println(result);
    }

    }
