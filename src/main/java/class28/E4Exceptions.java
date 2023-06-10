package class28;

public class E4Exceptions {
    public static void main(String[] args) {
        System.out.println("LIne 1");
        System.out.println("LIne 2");
        System.out.println("LIne 3");
        System.out.println("LIne 4");
        System.out.println("LIne 5");
        try {
            "name".charAt(6);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Plan b");
        }

        System.out.println("LIne 6");
    }
}
