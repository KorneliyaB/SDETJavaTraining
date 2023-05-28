package Project2;

public class Task5 {
    public static void main(String[] args) {
            String str ="abracadabra";

            for(char repetitive : str.toCharArray()){
                if ( str.indexOf(repetitive) == str.lastIndexOf(repetitive)) {
                    System.out.println(repetitive);
                    break;
                }
            }
        }
    }

//Find the First Non-Repeating Character in a String: Given a string,
//find and return the first non-repeating character. For example, in the
//string "abracadabra", the first non-repeating character is 'c'.