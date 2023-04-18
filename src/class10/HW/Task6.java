package class10.HW;

public class Task6 {
    /* Create 2D array of countries: north america countries, south america countries,
    europe countries, asian countries, african countries. Then print all values from
     that array using 2 different loops and calculate how many total countries been stored.
     */
    public static void main(String[] args) {
        String [][] countries={
                {"Mexico","USA","Canada"}, //north america countries
                {"Cuba","Panama","Venezuela"}, //south america countries
                {"Spain","France","Italy"}, //europe countries
                {"Japan","China","South Korea"}, //asian countries
                {"Nigeria","Ethiopia","Angola","Uganda"} //african countries
        };
        int sum=0;
        for (int i=0;i< countries.length; i++){
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum++;

            }
            System.out.println();
        }
        System.out.println();

        int sum2=0;
        for (String[]country:countries){
            for (String c:country){
                System.out.print(c+" ");
                sum2++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries - "+ sum2);



    }
}
