package class17.HomeWork;

import class11.Student;

public class Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    // students with different marks.
    // Your program should print an average mark of each student's name.
    String name;
    int grade;
    int grade1;
    int grade2;

    public Students(String name, int grade, int grade1, int grade2) {
        this.name = name;
        this.grade = grade;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }
    public void printStudentInfo(){
        int averageGrade=(grade+grade1+grade2)/3;
        System.out.println("Student "+ name+":average grade is "+ averageGrade);
    }

    public static void main(String[] args) {
        Students student1=new Students("Axel",89,86,65);
        student1.printStudentInfo();
        Students student2=new Students("Tom",84,61,92);
        student2.printStudentInfo();
        Students student3=new Students("Elena",76,93,82);
        student3.printStudentInfo();
        Students student4=new Students("Nelly",93,89,98);
        student4.printStudentInfo();
        Students student5=new Students("Kate",85,65,95);
        student5.printStudentInfo();
    }
}
