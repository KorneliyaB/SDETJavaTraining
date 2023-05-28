package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        // whrite a loop  to add all the even numbers from 1 to 30
        int sum=0;
       for (int num=1; num<=30;num++){
           if (num%2==0){
               sum=sum+num;
           }

       }
       System.out.println(sum);
    }
}
