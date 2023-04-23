package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="Java is very very easy";
        //method changing calling multiple methods on the same line
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);


        String searchWord="Java";
        System.out.println(sentence.startsWith("java"));
    }
}
