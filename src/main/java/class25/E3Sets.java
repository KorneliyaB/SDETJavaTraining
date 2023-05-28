package class25;

import java.util.HashSet;

public class E3Sets {
    //HashSet does not take duplicates and does not remember the insertions order
    // takes all inputs and makes them random
    //don't have .get method
    public static void main(String[] args) {
        HashSet<String> uniqNames=new HashSet<>();
        uniqNames.add("B");
        uniqNames.add("Z");
        uniqNames.add("C");
      //  System.out.println(uniqNames);
        for (String name:uniqNames){
            System.out.println(name);
        }
    }

}
