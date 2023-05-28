package class16;

public class Person {
    public String name="Vlad";
     String SSN="1325554";
    private String password;
    private static double bankBalance=12000;
    private void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person Farwa=new Person();
        Farwa.password="12345";
        Farwa.printPassword();

        System.out.println(Person.bankBalance);


    }

}
