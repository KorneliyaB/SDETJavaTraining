package class12;

public class Task2 {
    public static void main(String[] args) {
        String name="Today is Saturday";
        //print all the indexes wherever the letter 'a' is appearing
        int count = 0;
        for (int i = 0; i <name.length(); i++) {
            if (name.charAt(i) == 'a')  {
                System.out.print(i+" ");// to find under what index we have letter 'a'
                System.out.print(name.charAt(i));// to print all 'a'
    }

}
    }}
