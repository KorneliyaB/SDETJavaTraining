package class14;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void larger(int a, int b) {
        System.out.println(Math.max(a, b));
    }
    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.larger(15,29);
    }
}

