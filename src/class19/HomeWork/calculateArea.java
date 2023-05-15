package class19.HomeWork;

public class calculateArea {
    // Create 1 class in which create a methods that will calculate the area of Method
    // name must be called calculateArea
    //Rectangle
    //Square
    int sq;
    int l;
    int w;
    calculateArea(int l, int w){
        this.l=l;
        this.w=w;
        System.out.println(l*w);
    }
    calculateArea(int sq){
        this.sq=sq;
        System.out.println(sq*sq);
    }

    public static void main(String[] args) {
        calculateArea rectangular = new calculateArea(4, 2);
        calculateArea square = new calculateArea(5);
    }
    }
