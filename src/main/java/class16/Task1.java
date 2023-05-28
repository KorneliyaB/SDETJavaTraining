package class16;

public class Task1 {
    //Create a method that will accept an array as
    // parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and
    // accessible by the creating an instance of the class.
     int number (int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 obj= new Task1();
        int [] arr1={54,544,1,8};
        int total=obj.number(arr1);
        System.out.println(total);
    }
    }


