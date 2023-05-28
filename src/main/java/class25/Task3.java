package class25;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("United States");
        countries.add("India");
        countries.add("Ukraine");
        countries.add("Spain");

        System.out.println(countries);

        // Method 1: Using for-each loop
        for (String country : countries) {
            System.out.println(country);
        }

        // Method 2: Using iterator
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
