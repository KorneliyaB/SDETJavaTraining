package class26.Homework;

public class Person {
    private String name;
    private String lasName;

    private int age;

    private int salary;

    public Person(String name, String lasName, int age, int salary) {
        this.name = name;
        this.lasName = lasName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Last Name: " +  lasName + "; Age: " + age + "; Salary: " + salary;
    }

}

/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */