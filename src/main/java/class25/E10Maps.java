package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticj", 100.0);
        makeup.put("BlushOn", 68.0);
        makeup.put("Eyeliner", 50.0);
        makeup.put("Foundation", 85.0);
        makeup.put("Base", 25.0);

        //var keys=makeup.keySet();
       // keys.removeIf(x->x.contains("a"));
       // System.out.println(makeup);

        //remove the item which is more than 80
        Collection<Double> values=makeup.values();
        values.removeIf(v->v>80);
        System.out.println(makeup);

        XSSFWorkbook xssfWorkbook;
    }
}
