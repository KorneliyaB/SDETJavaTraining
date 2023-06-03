package class26;

import java.util.*;

public class TAsk1 {
    public static void main(String[] args) {
        Map<String, Double> drinks = new HashMap<>();
        drinks.put("Coke", 2.0);
        drinks.put("Milk", 3.8);
        drinks.put("Mango juice", 2.5);
        drinks.put("Coffee", 4.8);
        drinks.put("Tea", 1.5);
//remove only those which contains letter i and their price is if less than 3

        Set<Map.Entry<String,Double>> entrySet= drinks.entrySet();
        for (Map.Entry<String,Double> e:entrySet) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        //List<Map<String,Double>> mapList=new ArrayList<>();

    }

    }
