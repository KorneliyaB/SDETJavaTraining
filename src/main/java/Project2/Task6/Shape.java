package Project2.Task6;

public interface Shape {
    double calculateArea(double a, double b);

    double calculatePerimiter(double a, double b);
}

class Circle implements Shape {

    @Override
    public double calculateArea(double a, double b) {
        double area = (a * (b * 2));
        return area;
    }
    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = 2 * a * b;
        return perimiter;
    }

}
class Square implements Shape {
    @Override
    public double calculateArea(double a, double b) {
        double area = a * b;
        return area;
    }
    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = a * b;
        return perimiter;
    }
}
//Create an Interface 'Shape' with undefined methods as calculateArea
//and calculatePerimiter. Create 2 classes Circle & Square that
//implements functionality defined in the Shape Interface. Test your
//code.