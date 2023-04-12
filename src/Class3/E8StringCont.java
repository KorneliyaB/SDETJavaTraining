package Class3;

public class E8StringCont {
    public static void main(String[] args) {
        //if string combined with int (first name than num )using left to right rule the result just
        // writing everything together Leo1010
        System.out.println("Leo"+10+10);
        //but if int first and than string we do addition and than name 20Leo
        System.out.println(10+10+"Leo");
        // Due to parenthesis addition will be performed Leo20
        System.out.println("Leo"+(10+10));
        //Left to right rule is no applicable in math
        System.out.println(2+2*2);
        System.out.println((2+2)*2);

    }
}
