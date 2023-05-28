package class22;

public interface ArrayUtil {
    //search the array from number if found return true
    public boolean searchArr(int[]arr,int number);
    double getAvg(double[] arr);
    int countNum(double[]arr, int number);
    int add(int num1,int num2);


}
class Main implements ArrayUtil{
    @Override
    public int countNum(double[] arr, int number) {
       int count=0;
        for (double i:arr) {
            if (i== number) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean searchArr(int[] arr, int number) {
        for (int i=0;i<arr.length;i++){
        if (arr[i]==number){
        return false;
    }}
        return true;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public double getAvg(double[] arr) {
        double sum=0;
        for (int y = 0; y < arr.length; y++) {
            sum += arr[y];
        }
        return (double) sum / arr.length;


    }}

