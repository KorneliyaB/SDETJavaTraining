package class9.HomeWork;

public class Names {
    //Create an array of names and store all names of your group.
    // Then print your name from that array. (use 2 different ways of creating an array).
    public static void main(String[] args) {
        String [] names={"Asghar","Vlad","Kate","Korneliya"};
        System.out.println(names[3]);

        System.out.println();
        String [] name=new String[4];
        name[0]="Asghar";
        name[1]="Vlad";
        name[2]="Kate";
        name[3]="Korneliya";
        System.out.println(name[3]);
    }
}
