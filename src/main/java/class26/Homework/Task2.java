package class26.Homework;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
    TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Kate Johnson", 95000);
        employee.put("Vicky Smith", 125000);
        employee.put("Tom Mike", 102000);
        employee.put("Kevin Wilson", 85000);

    int hSalary = 0;
    String hEmployee = "";

        for (var v : employee.entrySet()) {
        if (v.getValue() > hSalary) {
            hSalary = v.getValue();
            hEmployee = v.getKey();
        }
    }

        System.out.println(hEmployee + "-$" + hSalary);

}
}
/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
the highest salary. Output should be in the below format John Smith=$100000
 */
