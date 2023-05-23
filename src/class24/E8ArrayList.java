package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E8ArrayList {
    //Create an arrayList of words. Remove every word that ends with "e" using iterator
        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();
            words.add("chair");
            words.add("grape");
            words.add("phone");
            words.add("TV");
            words.add("done");

            words.removeIf(word -> word.endsWith("e")); //words.removeIf(x -> x.endsWith("e"))

            /**Iterator<String> iterator= words.iterator();// get an Iterator object for the ArrayList
            while (iterator.hasNext()){ // loop through the ArrayList using the iterator,
                // .hasNext() method in iterator is used to check if there is a next element in the collection
                String word=iterator.next(); // get the current word, using .next instead of i--;
                if (word.endsWith("e")){ // check if the word ends with "e"
                    iterator.remove(); //remove the word from the ArrayList using the iterator
                }
            }**/
            System.out.println(words);

    }
}
