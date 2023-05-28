package class9.HomeWork;

public class Calculate {
    //Create an array on integers
    // and calculate the sum of all elements in an array
    public static void main(String[] args) {
        int [] total={56,8,-12,29};
        int sum=0;
        for (int r=0;r< total.length;r++){
            sum=sum+total[r];
        }
            System.out.println(sum);

        }
    }

