package class23;

import java.util.ArrayList;

public class E3Collection {
        public static void main(String[] args) {
            ArrayList<String> names=new ArrayList<>();
            names.add("Zak");
            names.add("Vlad");
            names.add("Julia");
            names.add("Ilia");
            names.add("Adam");
            names.add("Nelly");
            names.remove("Julia");// you can remove based on index or on actual value
            //index 0, value "Adam"
            names.remove(2);
            System.out.println(names.indexOf("Adam"));//shows under what index name Adam is

            //names.clear();//remove everything
           System.out.println(names);
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));

            }
    }
}
