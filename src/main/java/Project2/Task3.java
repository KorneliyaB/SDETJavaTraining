package Project2;

public class Task3 {
    public static void main(String[] args) {

        String s = "Hello, world!";

        String[] words = s.trim().split("\\s+");

        System.out.println(words.length);
    }
}

//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.