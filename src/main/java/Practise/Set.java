package Practise;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> colors=new HashSet<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original Hash Set: "+colors);

        int numColors= colors.size();
        System.out.println("Size of the Hash Set: "+numColors);

    }
}
