package Class3.HomeWork;

public class Hours {
    //  Create Java program to store 2 values for expected and actual hours. Your program should check
    //if expected hours are more than  actual the program should print “You will love the course and you will succeed”,
    //otherwise “Course will be very hard for you!”
    public static void main(String[] args) {

        double expectedHour=5.30;
        double actualHour=3.15;
        if  (expectedHour>actualHour){
            System.out.println("You will love the course and you will succeed");
        }
        else {
            System.out.println("Course will be very hard for you!");
        }

    }
}
