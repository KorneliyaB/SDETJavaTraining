package class9.HomeWork;

public class Grades {
    public static void main(String[] args) {
        //Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).
        char [] index={'A','B','C','D'};
        System.out.println(index[1]);

        System.out.println();

        char [] alphabet=new char[4];
        alphabet[0]='A';
        alphabet[1]='B';
        alphabet[2]='C';
        alphabet[3]='D';
        System.out.println(alphabet[1]);

    }

}
