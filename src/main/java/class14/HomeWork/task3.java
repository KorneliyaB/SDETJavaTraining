package class14.HomeWork;

public class task3 {
    //Write a method to return whether given number is prime or not?
    //prime num can be divided itself or by 1
    String isPrime(int number){
        boolean prime=false;
        if(number<2){
            return number+ " is a prime number";
        }else {
            return number +" is not a prime number";
        }
    }

    public static void main(String[] args) {
        task3 obj=new task3();
        int num=1;
        String result=obj.isPrime(num);
        System.out.println(result);
    }
}
