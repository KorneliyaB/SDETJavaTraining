package class9.HomeWork;

public class LargestNumber {
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int [] largest={3,29,951,33,59};
        int max=largest[0];

        for (int i=0;i< largest.length;i++){
            if (largest[i]>max){
                max=largest[i];

            }
        }
        System.out.println(max);

    }
    }