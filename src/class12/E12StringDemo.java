package class12;

public class E12StringDemo {
    public static void main(String[] args) {
        // subString is used to get a part of the complete String
        String sentence="yup we have another class";
        System.out.println(sentence.substring(4,11));

        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex,sentence.length()));
    }
}
