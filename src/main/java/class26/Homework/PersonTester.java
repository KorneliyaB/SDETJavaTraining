package class26.Homework;

import java.util.TreeMap;

public class PersonTester {
        public static void main(String[] args) {

            var person = new TreeMap<>();
            person.put(3, new Person("Tom", "Owen", 28, 125000));
            person.put(1, new Person("Kate", "Johnson", 35, 98000));
            person.put(4, new Person("Kevin", "Olin", 27, 130000));
            person.put(2, new Person("Vicky", "Thomson", 29, 98000));

            for (var p : person.entrySet()) {
                System.out.println(p.getKey() + " " + p.getValue());

            }

        }
}
