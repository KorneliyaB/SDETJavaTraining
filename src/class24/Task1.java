package class24;

import java.util.ArrayList;

public class Task1 {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tom");
        arrayList.add("Kate");
        arrayList.add("Adam");
        arrayList.add("Nelly");
        arrayList.add("Alina");

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Adam"));
        System.out.println(arrayList.size());

    }
}