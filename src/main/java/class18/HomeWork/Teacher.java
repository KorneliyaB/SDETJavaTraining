package class18.HomeWork;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
    String name;
    String gender;
    int age;
    String subject;

    void teach() {
        System.out.println("Teaching");
    }

    void work() {
        System.out.println("Working hard");
    }

    void eating() {
        System.out.println("Teacher is eating on lunch break");
    }

    void help() {
        System.out.println("Helping the students");

    }
}