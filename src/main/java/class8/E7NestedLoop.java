package class8;

public class E7NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 3 ; i++) {
            for (int j=1;j<5;j++) {
                System.out.print(j + " ");
            }
            System.out.println();//in this situation this make code look 3 times under
            // each other instead of one line
        }
    }
}
