package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "KorneliyaK";
        //System.out.println(name.charAt(1));

        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'K') {
                count++;
            }
        }
        System.out.println(count);
    }
}
