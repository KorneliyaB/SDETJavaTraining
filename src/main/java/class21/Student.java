package class21;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void learn() {
        System.out.println("students and learning a lot");}
        void read(){
            System.out.println("read read read");}
}
class SyntaxStudent extends Student{
    @Override
    void learn() {
        System.out.println("the best student");}
    void read(){
        System.out.println("read read read a lot");}
void study(){
    System.out.println("java java java");}
}
class CollageStudent extends Student{
    @Override
    void learn() {
        System.out.println("dose not like to learn");
    }
}
class SchoolStudent extends Student{
    @Override
    void read(){
        System.out.println("dose not like to read");}
}
