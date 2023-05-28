package class9.HomeWork;

public class Animals {
    //Create an array of animals and store 5 elements
    // into it. Using 2 different loops print all elements from the array.
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "horse", "sheep", "pig"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");

        }
        System.out.println();


        String[] animal = new String[5];
        animal[0] = "cat";
        animal[1] = "dog";
        animal[2] = "horse";
        animal[3] = "sheep";
        animal[4] = "pig";
        for (int k = 0; k < animal.length; k++) {
            System.out.print(animal[k] + " ");

        }

    }
}

