package class16.HomeWork;

public class Task1 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String returns(String s) {
        String empty = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            empty = empty + s.charAt(i);

        }
        return empty;
    }
    public static void main (String[]args){
        Task1 obj = new Task1();
        String answer = obj.returns("Hello World");
        System.out.println(answer);
    }






}
