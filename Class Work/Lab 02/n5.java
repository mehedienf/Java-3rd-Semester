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
public class n5 {
    public static void main(String[] args) {
        Square[] square = new Square[15];

        for (int i = 0; i < square.length; i++) {
            square[i] = new Square(i+1);
            System.out.println("For side = " + (i+1));
            square[i].area();
        }
    }
}