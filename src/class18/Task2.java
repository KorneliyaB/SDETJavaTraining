package class18;

import static class18.Task2.printF;

public class Task2 {
    static void printF() {
        System.out.println("Hello");
    }

}
class ClassB extends A {
    public static void main(String[] args) {
        printF();
    }
}
