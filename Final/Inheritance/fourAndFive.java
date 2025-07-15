class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
}
class Square extends Rectangle {
    int side;
    Square(int side) {
        super(side, side);
        this.side = side;
    }
    double perimeter() {
        return 4 * side;
    }
}

public class fourAndFive {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());

        Square square = new Square(5);
        System.out.println("Perimeter of square: " + square.perimeter());
        System.out.println("Area of square: " + square.area());

        Square[] squares = new Square[15];
        for (int i = 0; i < 15; i++) {
            squares[i] = new Square(i+1);
            System.out.println("Square with side " + (i+1) + ": Area of square: " + squares[i].area());
        }
    }
}
