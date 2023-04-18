package class10.HW;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 1: Create a 2D array (shorter way) in which first array will consist of 4 names
       and second array will contain grades.
        Then your program should print name of the students that has A and B grade
         */
        String[][] studentData = {
                {"Tom", "Elena", "Alex", "Kate"},
                {"A", "B", "C", "D"}
        };

        for (int i = 0; i < studentData[0].length; i++) {
            // for (int j = 0; j < 1; j++) { // need for repeat the code
            if (studentData[1][i].equals("A") || studentData[1][i].equals("B"))
                System.out.println(studentData[0][i] + " " + studentData[1][i]);
        }
        // }
        System.out.println();

    }
}


