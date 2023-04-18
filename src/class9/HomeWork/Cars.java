package class9.HomeWork;

public class Cars {
    //Create an array of cars and store 6 elements into it.
    // Using 2 different loops print all values from the array.
    public static void main(String[] args) {
        String [] cars={"BMW","Nissan","Ford","Honda","Toyota","Kia"};
        for (int i=0;i<cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        String [] carComp=new String[6];
        carComp[0]="BMW";
        carComp[1]="Nissan";
        carComp[2]="Ford";
        carComp[3]="Honda";
        carComp[4]="Toyota";
        carComp[5]="Kia";
        for (int j=0;j< carComp.length;j++){
            System.out.print(carComp[j]+" ");
        }

    }
}
