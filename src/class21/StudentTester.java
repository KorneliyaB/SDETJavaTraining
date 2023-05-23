package class21;

import class17.Food;

public class StudentTester {
    public static void main(String[] args) {
        Student student[]={new SyntaxStudent(), new CollageStudent(),
        new SchoolStudent()};
        for (Student mates:student){
        mates.learn();
        mates.read();
        }
        Student syntax=new SyntaxStudent();
        SyntaxStudent SS=(SyntaxStudent) syntax;
        SS.study();

        }
    }

