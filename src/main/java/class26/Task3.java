package class26;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        // Print all keys and values from a country map using for each loop.
        // Print all values from a country map using for each loop and iterator. in Java using tree
        Map<String, String> country = new TreeMap<>();

        country.put("United States", "Washington D.C.");
        country.put("United Kingdom", "London");
        country.put("Ukraine","Kiev");
        country.put("India", "New Delhi");
        country.put("Spain","Madrid");
        System.out.println("-----------------------");
        for (var entry : country.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            ///both ways are good better var
            //for (Map.Entry<String, String> entry : country.entrySet()) {
            //System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("--------------------------------");
        for (String capital : country.values()) {
            System.out.println(capital);
        }
    }
}

