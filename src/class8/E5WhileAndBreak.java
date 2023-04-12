package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        // create a boolean variable summer store true in it than
        // write a loop  that runs as long as it is summer create a temp variable store 85 and
        // inside the loop check the temp if it is less than 100  print "its good enjoy summer"
        //as soon as temp exceeds 100 print"its very hot" and break the loop with break keyword
        boolean summer=true;
        int temp=85;
        while(summer){
            if (temp<100){
                System.out.println("its good enjoy summer");

            }else{
                System.out.println("Its very hot");
                break;
            }
            temp=temp+3;
        }
    }
}
