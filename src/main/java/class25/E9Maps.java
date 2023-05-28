package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticj",100.0);
        makeup.put("BlushOn",68.0);
        makeup.put("Eyeliner",50.0);
        makeup.put("Foundation",85.0);
        makeup.put("Base",25.0);

        Set<String> keys=makeup.keySet();
        System.out.println(keys);
       // Collection value=makeup.values(); both are good
        var value=makeup.values();
        System.out.println(value);
    }
}
