package Class2.Homework;

public class Variables {
    /* Create a Java program and name it Variables
In your program create different type of variables to store student’s information(name,last
name, grade, city, state, phone number) and then print value of those variables in the format:
My name is  and my  last name is __
I am A/B student
I live in city and state__
And my phone number is …..
     */
    public static void main(String[] args) {
        String myName="Korneliya";
        String myLastName="Banyas";
        String myGrade="B";
        String myCity="Georgia";
        String myState="Atlanta";
        String myPhoneNUmber="+18501234567";
        System.out.println("My name is"+" " + myName +" " + "and my last name"+" " + myLastName);
        System.out.println("I am" + " " + myGrade+ " "+"student");
        System.out.println("I live in"+ " "+ myCity +" " +myState);
        System.out.println("And my phone number is"+ " "+ myPhoneNUmber);
        /* Task3 Change student’s city, state, phone number and grade.
        And print those updated values:
         */
        myGrade="A";
        myCity="Panama City";
        myState="Florida";
        myPhoneNUmber="+18500306321";
        System.out.println("My name is"+" "+myName+" "+"and I moved to a new city"+" "+myCity+", "+myState+". ");
        System.out.println("My new phone number is"+" "+myPhoneNUmber);
        System.out.println("My grade is"+" "+myGrade);

    }
}
