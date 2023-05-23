package Practise;

public class P8 {
        public static void main(String[] args) {
            Tea obj1 = new LemonTea();
            obj1.addSugar();

            Tea obj2 = new ChaiTea();
            obj2.addSugar();
        }
    }

    abstract class Tea {
        protected String teaType;

        public Tea(final String teaType) {
            this.teaType = teaType;
        }

        public abstract void addSugar();
    }

    class LemonTea extends Tea {
        public LemonTea() {
            super("Lemon Tea");
        }

        @Override
        public void addSugar() {
            System.out.println("For " + teaType + " we need 2 spoons of sugar");
        }
    }

    class ChaiTea extends Tea {
        public ChaiTea() {
            super("Chai Tea");
        }

        @Override
        public void addSugar() {
            System.out.println("For " + teaType + " we need 1 spoon of sugar");
        }
    }




