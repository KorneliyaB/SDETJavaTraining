package class25.HomeWork;

import java.util.Arrays;
import java.util.HashSet;

public class Student {
    //Create a Set that will hold Objects of Student Type. In this set we do not care about the
    // insertion order.
    // Each student object should have name and studentID. Display name of each student.
    private String name;
    private String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }
}

class StudentTester {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.addAll(Arrays.asList(new Student("Alex", "133a"), new Student("Tom", "654d"),
                new Student("Kevin", "3145f")));
        for (Student s : students){
            System.out.println(s.getName() + " " + s.getStudentID());
        }

    }
}
