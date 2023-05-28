package class15.HomeWork;

import class11.Student;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String Name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.Name="Alex";
        student1.ID="sd2548";
        numberOfStudents++;

        Students student2=new Students();
        student2.Name="Kiran";
        student2.ID="dsv2548";
        numberOfStudents++;

        Students student3=new Students();
        student3.Name="Nelly";
        student3.ID="iah2578";
        numberOfStudents++;

        System.out.println("Number of students " +numberOfStudents);

    }

}
