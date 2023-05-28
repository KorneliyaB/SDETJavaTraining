package class18;

public class CarsTester {
    public static void main(String[] args) {
        BMW.Honda honda=new BMW.Honda();
        honda.color="red";
        System.out.println(honda.color);
        honda.start();

        BMW bmw=new BMW();
        bmw.honk();
        bmw.model="7 series";
        System.out.println(bmw.model);
        bmw.offerMPackage();
    }
}
