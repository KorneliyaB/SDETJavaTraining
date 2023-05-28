package Project2.Task8;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(50000,"white",25);
        Truck truck = new Truck(60000,"black", 2023 );
        System.out.println(sedan.calculateSalePrice(25));
        System.out.println(truck.calculateSalePrice(2023));
    }
}
