package Project2.Task7;

abstract class Marks {
    abstract double getPercentage();

}

class A extends Marks {
    double subject;
    double subject1;
    double subject2;
    public A(double subject, double subject1, double subject2) {
        this.subject=subject;
        this.subject1=subject1;
        this.subject2=subject2;
    }
    @Override
    double getPercentage() {
        double totalMarks = subject+subject1+subject2;
        return totalMarks/3;
    }
}
class B extends Marks {
    double subject;
    double subject1;
    double subject2;
    double subject3;

    public B(double subject, double subject1, double subject2, double subject3) {
        this.subject = subject;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject+subject1+subject2+subject3;
        return totalMarks/4;
    }
}
