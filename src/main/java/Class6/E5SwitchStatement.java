package Class6;

public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender='F';
        switch (gender){
            case 'F':
            System.out.println("female");
            break;
            case 'M':
                System.out.println("male");
                break;
            case '0':
                System.out.println("others");
                break;
            default:
                System.out.println("nobody");
        }
    }
}
