package class21.HomeWork;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {
                new Apple("MacBook Pro", 2500),
                new Lenovo("i7", 900),
                new HP("48569", 460),
                new Dell("3 years", 980),
        };

        for (Computer computer : computers) {
            computer.displayInfo();
            computer.turnOn();
            computer.turnOff();

            if (computer instanceof Apple) {
                Apple apple = (Apple) computer;
                apple.useiTunes();
            } else if (computer instanceof Lenovo) {
                Lenovo lenovo = (Lenovo) computer;
                lenovo.useTrackPoint();
            } else if (computer instanceof HP) {
                HP hp = (HP) computer;
                hp.useHPAssistant();
            } else if (computer instanceof Dell) {
                Dell dell = (Dell) computer;
                dell.useDellSupport();
            }
            System.out.println();
        }

    }
}

