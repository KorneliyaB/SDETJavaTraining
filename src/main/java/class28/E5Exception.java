package class28;

public class E5Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try {
           // System.out.println(10/0);
            //int [] arr=new int[-5];
            "".charAt(10);
        }
        catch (ArithmeticException e){
            System.out.println("Someone is trying to divide by zero");
        }
        catch (NegativeArraySizeException e){
             System.out.println("Someone is trying to create an array og neg size");
        }
        catch (Exception e){
              System.out.println("Something went wrong executing Backup code");
        }
              System.out.println("4");
    }
}
