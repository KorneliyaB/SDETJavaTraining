package class13;

public class Math {
    void add(int num1, int num2,int num3) {
        System.out.println(num1 + num2+num3);


    }
    //defining a method
    //void multiply(int n1,int n2,int n3)
    //{
     //   System.out.println(n1*n2*n3);
    //}

    public static void main(String[] args) {
    //creating the object of the Math class calling it math
       Math math=new Math();
         //calling the method add and two values
       math.add(10,10,9);

        //math.multiply(2,2,5);

    }

}
