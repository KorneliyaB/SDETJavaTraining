package Class6;

public class E6SwitchStatement {
    public static void main(String[] args) {
        String name="Vlad";

        switch (name){
            case "Vlad":
                System.out.println("Algonquin");
                break;
            case "Jacob":
                System.out.println("Chicago");
                break;
            case "Nelly":
                System.out.println("Florida");
                break;
            default:
                System.out.println("NY");
        }
    }
}
