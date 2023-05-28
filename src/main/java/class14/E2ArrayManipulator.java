package class14;

public class E2ArrayManipulator {
    /*
    create a method that will take an int array call it sumArr and return the sum
    of all the elements from that array create the object of the class and call the method
     */
    /*
    return type int
    name of the method => sumArr
    parameters => (int[] arr)
    body=>{go through all the elements if the array add them and return the result
     */
    //Create class
    //Create method in class
    //In main method, create an object of the class
    //perform method on the object (call the method)
    //If the method returns something, you can assign it to a variable when you call the method on the object

    int sumArr(int [] arr) {
        int sum = 0;
        for (int num : arr) { //for(int i=0;i<arr.length;i++){
            sum += num; // sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        E2ArrayManipulator obj=new E2ArrayManipulator();
        int[]array={10,20,30};
        int result=obj.sumArr(array);
        //Scanner scanner=new Scanner(System.in)
        // int age=scanner.nextInt()
        System.out.println(result);
    }
}
