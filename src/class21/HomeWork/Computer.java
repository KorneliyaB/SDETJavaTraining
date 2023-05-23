package class21.HomeWork;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array.
    // Loop through each object and execute available methods.
        private String brand;
        private int price;

        Computer(String brand, int price) {
            this.brand = brand;
            this.price = price;
        }

        void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Price: $" + price);
        }

        void turnOn() {
            System.out.println(brand + " computer is turning on.");
        }

        void turnOff() {
            System.out.println(brand + " computer is turning off.");
        }

    }

    class Apple extends Computer {
        String model;

        Apple(String model, int price) {
            super("Apple", price);
            this.model = model;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Model: " + model);
        }

        void useiTunes() {
            System.out.println("Using iTunes on " + model);
        }
    }

    class Lenovo extends Computer {
        String processor;

        Lenovo(String processor, int price) {
            super("Lenovo", price);
            this.processor = processor;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Processor: " + processor);
        }

        void useTrackPoint() {
            System.out.println("Using TrackPoint on Lenovo");
        }
    }

    class HP extends Computer {
        String serialNumber;

        HP(String serialNumber, int price) {
            super("HP", price);
            this.serialNumber = serialNumber;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Serial Number: " + serialNumber);
        }

        void useHPAssistant() {
            System.out.println("Using HP Assistant");
        }
    }

    class Dell extends Computer {
        String warranty;

        public Dell(String warranty, int price) {
            super("Dell", price);
            this.warranty = warranty;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Warranty: " + warranty);
        }

        void useDellSupport() {
            System.out.println("Using Dell Support");
        }
    }