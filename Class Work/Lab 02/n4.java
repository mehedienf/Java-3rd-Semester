class Rectangle {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void area() {
        System.out.println("Area of the rectangle : " + length*breadth);
    }
    void perimeter() {
        System.out.println("Perimeter of the rectangle : " + (2*(length+breadth)));
    }
}
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
public class n4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(5);
        square.area();
        square.perimeter();
    }
}
