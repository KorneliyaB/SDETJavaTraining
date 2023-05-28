package class12.HomeWork;

public class Task1 {
    // Create a String and if the String is not empty perform the following:
    //if the String has an odd number of characters and has 3 or more characters,
    // print the character in the middle of the String.
    //For Example String str=hello =>l
    public static void main(String[] args) {
        String str = "Welcome";
            if (!str.isBlank() && str.length()%2==1 && str.length()>3){
                int middleIndex = str.length()/2;
                char mid = str.charAt(middleIndex);
                System.out.println(mid);
            }

        }
    }

