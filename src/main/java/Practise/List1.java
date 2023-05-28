package Practise;
import java.util.List;
import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {

            List<String> countries = new LinkedList<>();
            countries.add("Armenia");
            countries.add("USA");
            countries.add("Kazakhstan");
            countries.add("Australia");
            countries.add("Pakistan");
            countries.add("Russia");
            countries.add("Azerbaijan");

            LinkedList<String> newList = removeElements((LinkedList<String>) countries);

        System.out.println(newList);
    }

    public static LinkedList<String> removeElements(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<String>();

        for (String element : list) {
            if (!element.startsWith("A")) {
                newList.add(element);
            }
        }

        return newList;
    }
}
