package class10.HW;

public class Task4 {
    public static void main(String[] args) {
        /* Using 2D array create a grocery list.
           Inside you should have an array of veggies, fruits,
           dairy and sweets. Retrieve all values from that array using 2 different loops
         */
        String[][] grocery = {
                {"cucumber","tomatoes","carrots"},//veggies
                {"strawberry","banana","kiwi"},//fruits
                {"milk","cheese","butter"},//dairy
                {"cake","chocolate","cookies"} //sweets
        };//loop1
        for (int i = 0; i < grocery.length ; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //loop2
        for (String[] row : grocery) {
            for (String f : row){
            System.out.print(f +" ");

        }
        System.out.println();

    }
}}
