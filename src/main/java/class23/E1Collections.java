package class23;

import java.util.ArrayList;

public class E1Collections {
    public static void main(String[] args) {

        String name = "Vero";
        String name1 = "Rajbeer";
        String[] names = {"Saral", "Lean"};
        int size = 2;
        String[] names2 = new String[size];// this is how we used to create array
        names2[0] = "Semir";

        ArrayList<String> arrayList = new ArrayList<>(); //creating array list
        arrayList.add("Pavel");
        arrayList.add("RAmil");
        arrayList.add("Tom");
        arrayList.add("Adam");
        arrayList.add("Mark");
        arrayList.add("Zak");
        System.out.println(arrayList);

    }
}
