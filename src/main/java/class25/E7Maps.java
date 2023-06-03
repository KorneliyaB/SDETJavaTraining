package class25;

import java.util.HashMap;
import java.util.Map;

public class E7Maps {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new HashMap<>();
        grocery.put("Apple",7.5);
        grocery.put("Soap",2.1);
        grocery.put("Eggs",3.8);
        grocery.put("Milk",3.5);
        // if we insert the data with same key again. it will override
        grocery.put("Apple",8.3);
        System.out.println(grocery);
        System.out.println(grocery.size());// shows th number of elements
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());
        for (Map.Entry<String, Double> value: grocery.entrySet()){
            System.out.println(value.getValue());
        }
    }
}
