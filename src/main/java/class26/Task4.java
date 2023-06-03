package class26;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuyMap = new HashMap<>();
        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(7845126,"Phone");
        bestBuyMap.put(5847625,"Watch");
        // Add more items here

        for (var entry : bestBuyMap.entrySet()) {
            System.out.println( entry.getKey() +"-"+entry.getValue());
        }
    }
}

