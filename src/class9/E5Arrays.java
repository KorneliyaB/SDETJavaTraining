package class9;

public class E5Arrays {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            if(i%2==0)
                System.out.print(i+" ");

        }
        System.out.println();
            char [] ind={'A', 'B','C','D','E'};
            for (int i = 0; i < ind.length; i+=2) {

                    System.out.print(ind[i]+" ");
            }
            

        }
    }
