package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {
        // String is non-primitive data type amd we can't use
        // == sign
        String name="Jacob";

        // name.equals("Corey") => checks if name the value that we write
        // inside equals() are same or not
        if(name.equals("JAcob")){
            System.out.println("I like swimming");
        }else{
            System.out.println("I like programming");
        }
    }
}
