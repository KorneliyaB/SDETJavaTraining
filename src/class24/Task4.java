package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }}
        System.out.println(numbers);

        numbers.removeIf(number->number % 5 == 0);
        System.out.println(numbers);
    }}


/* Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 5 == 0) {
              iterator.remove();
            }
       } */
