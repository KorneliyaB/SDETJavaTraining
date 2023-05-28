package Project2.Task6;

public class ShapeTester {
    public static void main(String[] args) {
        Circle cirlce = new Circle();
        System.out.println(cirlce.calculateArea(3.14, 6));
        System.out.println(cirlce.calculatePerimiter(3.14, 8));

        Square square = new Square();
        System.out.println(square.calculateArea(6, 6));
        System.out.println(square.calculatePerimiter(4, 6));

    }
}
