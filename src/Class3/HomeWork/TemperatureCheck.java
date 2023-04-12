package Class3.HomeWork;

public class TemperatureCheck {
    //Create a Java program and name it Temperature Check. Create variable to store temperature.
    // Your program should check if temperature is below 32 then it should print “Water will freeze with temperature ”,
    // otherwise “Water will NOT freeze with temperature ”.

    public static void main(String[] args) {
        int temp1=56;

        if (temp1<=32){
            System.out.println("Water will freeze with temperature"+" "+temp1);
        }
        else{
            System.out.println("Water will NOT freeze with temperature"+" "+temp1);
        }
    }
}
