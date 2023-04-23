package ReviewClasses.Review5;

public class TwoDArrayMore {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];

        // 1 row
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        //2row

        numbers[1][0] = 10;
        numbers[1][1] = 20;
        numbers[1][2] = 30;
        numbers[1][3] = 40;

        //3row
        numbers[2][0] = 100;
        numbers[2][1] = 200;
        numbers[2][2] = 300;
        numbers[2][3] = 400;
        //How ti find out how many rows we have?
        System.out.println(numbers.length); //row
        System.out.println(numbers[0].length); //coloms

        System.out.println();

        // print elements are divisible by 3
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                int num = numbers[row][col];
                if (num % 3 == 0) {


                }System.out.print("Numbers is divisible by 3:" +num);
            }

            System.out.println();


            // print all row and col numbers
            for (int r = 0; r < numbers.length; r++) {
                for (int col = 0; col < numbers[r].length; col++) {

                    System.out.print(numbers[r][col] + " ");

                }

            }
        }

    }}
