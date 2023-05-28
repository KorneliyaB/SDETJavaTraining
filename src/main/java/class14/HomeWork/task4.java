package class14.HomeWork;

public class task4 {
    //Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    String getGrade(int num) {
        if (num > 90) {
            return "A";
        } else if (num > 80 && num <= 90) {
            return "B";
        } else if (num > 70 && num <= 80) {
            return "C";
        } else if (num > 50 && num <= 70) {
            return "D";
        }
        return "F";
    }

    public static void main(String[] args) {
        task4 obj=new task4();
        int score=78;
        String result=obj.getGrade(score);
        System.out.println(result);
    }
}
