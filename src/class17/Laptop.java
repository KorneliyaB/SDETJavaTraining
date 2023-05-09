package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage,
                  boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }
    public Laptop(String make, String model, double batteryLife, int storage) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;

    }

    public static void main(String[] args) {
        Laptop hp=new Laptop("HP","HP Omen ",4,512,true,false,false);

    }
}
