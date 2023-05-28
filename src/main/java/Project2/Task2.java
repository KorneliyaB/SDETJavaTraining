package Project2;

public class Task2 {
    public static void main(String[] args) {
        String pal="madam";
        pal=pal.toLowerCase();
        StringBuilder str=new StringBuilder(pal);
        str.reverse();
        String newPal=str.toString();
        if (pal.equals(newPal)){
            boolean check=true;
            System.out.println(check);
        }else{
            System.out.println("false");
        }

    }
}
//Check if a String is Palindrome: Determine whether a given string is
//a palindrome, which means it reads the same forwards and
//backward. For example, "madam" is a palindrome.