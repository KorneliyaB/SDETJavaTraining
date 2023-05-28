package class14;

import class13.ArrayUtil;

public class E4ArrayUtils {
    /*
    create a method add two int numbers it should return the results back
    when called name of the method should be add
     */
    /*
    return type =>
    name of the method=> add
    parameters => (int a,int b)
    body of the method => {
    int sum=a+b;
    return sum;
     */

    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();
        int sum=obj.add(10,20);// colling the add methodon obj objet passing arguments one
        //is 10 other is 20 and storing
        System.out.println(sum);

    }
}
