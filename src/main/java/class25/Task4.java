package class25;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Atlanta");
        System.out.println(cities);
        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);
    }
}

