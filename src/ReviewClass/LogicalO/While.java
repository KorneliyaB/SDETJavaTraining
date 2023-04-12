package ReviewClass.LogicalO;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int sum=0;
        System.out.println(" int velue");

         while (sc.hasNextInt()){

             int num=sc.nextInt();
             sum+=num;
         }
    }
}
