package class24;

import java.util.ArrayList;

public class Task2 {
    //Create an arrayList of words. Remove every word that ends with "e"
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("chair");
        words.add("grape");
        words.add("phone");
        words.add("TV");
        words.add("done");



        System.out.println(words);

        for (int i = 0; i < words.size(); i++) { // loop through the ArrayList and remove every word that ends with "e"
          String word = words.get(i);
            if (word.endsWith("e")) { // check if the word ends with "e"
                words.remove(i);  // remove the word from the ArrayList
                i--; // decrement 'i' to avoid skipping elements
                //I used i--;   decremented i to avoid skipping elements, because if I don't use it, it skips one word with ending e
            }
        }
        System.out.println(words);
    }
}