package class14;

public class Task2 {
    //Write code that will take in a String input and check to see if it is a palindrome or not.
    //A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
    //Examples of palindromes:
    boolean isPalindromeSB(String str) {
        /*
new StringBuilder(str) => converts the String to a StringBuilder
reverse()=> it reverses the contents in StringBuilder
toString()=> it converts the Stringbuilder back to a String
equalsIgnoreCase(str)=> comparing the reversed String to original one
 */

        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
