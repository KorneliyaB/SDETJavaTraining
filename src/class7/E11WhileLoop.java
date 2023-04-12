package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        int num=100;
        while (num>=1) {
            System.out.print(num+" ");
            num--;
        }
        int num1=20;
        System.out.println();
        while(num1<=100) {
            System.out.print(num1+" ");
            num1+=2;

        }
        int num3=100;
        System.out.println();
        while(num3>=1) {
            if (num3 % 2==1) {
                System.out.print(num3+ " ");
            }
            num3--;
        }


    }
}
