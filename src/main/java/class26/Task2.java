package class26;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> buildingMap = new HashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Amazon");
        buildingMap.put(4, "Microsoft");
        buildingMap.put(5, "Youtube");
        buildingMap.put(6, "Apple");
        buildingMap.put(7, "Tesla");

        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Microsoft");
        buildingMap.put(4, "Amazon");
        buildingMap.put(5, "Youtube");
        buildingMap.put(6, "Apple");
        buildingMap.put(7, "Tesla");


        System.out.println(buildingMap.size());
        buildingMap.replace(4, "Facebook");
        buildingMap.remove(7);
        System.out.println(buildingMap);
    }
}
