package class15;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee e1=new SyntaxEmployee();
        e1.empID="12545";
        e1.salary=90000;
        System.out.println(e1.empID + ", $" + e1.salary + ", CEO: " + CEO);

        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID="25425";
        e2.salary=80000;
        System.out.println(SyntaxEmployee.CEO);



    }
}
