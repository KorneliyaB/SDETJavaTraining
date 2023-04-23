package ReviewClasses.Review3;

public class Switch {
    public static void main(String[] args) {
        String color="GREEN";

        switch (color.toLowerCase()){
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
