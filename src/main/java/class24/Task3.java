package class24;

import java.util.ArrayList;
import java.util.Iterator;



public class Task3 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("juice");
        drinks.add("tea");
        System.out.println(drinks);

        /*   for (int i = 0; i < names.size(); i++) {  //use this approach
            String word=names.get(i);
            if(word.contains("e")||word.contains("a")){
                names.set(i,"Water");
            }
        }*/


        drinks.replaceAll(x->{
            if (x.contains("a") || x.contains("e")){
                return "Water";
            }else{
                return x;
            }
        });
       // drinks.replaceAll(a -> a.contains("a") || a.contains("e") ? "water" : a);
        System.out.println(drinks);
    }
    }

