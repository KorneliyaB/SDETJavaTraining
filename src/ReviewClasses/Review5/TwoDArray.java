package ReviewClasses.Review5;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars={
                {"Ford","Lincoln","Dodge"},
                {"BMW","Audi","Mercedes","VW","Fiat"},
                {"Honda","Toyota","Subaru","Nissan"}
        };
        // to print 1 2Darray we write index and coloms
        System.out.println(cars[1][1]);
        System.out.println();

        // for printing out all elements we use nested lood and enhanced

        for (String[] car:cars){
            for (String garage:car){
                System.out.print(garage+" ");
            }
            System.out.println();
        }

    }
}
