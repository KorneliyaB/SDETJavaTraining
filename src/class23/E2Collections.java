package class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Zak");
        names.add("Vlad");
        names.add("Julia");
        names.add("Ilia");
        names.add("Adam");
        names.add("Nelly");
        System.out.println(names);
        System.out.println(names.size()); // shows how many names stored, output 6
        System.out.println(names.contains("Vlad"));
        System.out.println(names.get(0));
       names.remove("Vlad");
        System.out.println(names);

    }
}
