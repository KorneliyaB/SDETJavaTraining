package class19;

public class Math {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(long num1, long num2){
        System.out.println(num1-num2);

}
    public static void main(String[] args) {
        add(10,10);
        add(10,10.5);
        add(12.5,12.4);
        add(354124351,6512811);
    }
}
