class Point {
    private double x;
    private double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
}
class Quadrilateral {
    private Point p1, p2, p3, p4;
    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    Point getP1() {
        return p1;
    }
    Point getP2() {
        return p2;
    }
    Point getP3() {
        return p3;
    }
    Point getP4() {
        return p4;
    }
}
class Trapezoid extends Quadrilateral {
    private double height;
    Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }
    double getArea() {
        double base1 = Math.abs(getP1().getX() - getP2().getX());
        double base2 = Math.abs(getP3().getX() - getP4().getX());
        return 0.5 * (base1 + base2) * height;
    }
}
class Parallelogram extends Quadrilateral {
    private double base;
    private double height;

    Parallelogram(Point p1, Point p2, Point p3, Point p4, double base, double height) {
        super(p1, p2, p3, p4);
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return base * height;
    }
}
class Rectangle extends Parallelogram {

    Rectangle(Point p1, Point p2, Point p3, Point p4, double length, double width) {
        super(p1, p2, p3, p4, length, width);
    }
    double getArea() {
        return super.getArea();
    }
}
class Square extends Rectangle {
    Square(Point p1, Point p2, Point p3, Point p4, double side) {
        super(p1, p2, p3, p4, side, side);
    }
    double getArea() {
        return super.getArea();
    }
}
public class seven {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(1, 3);
        Point p4 = new Point(3, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 3);
        System.out.println("Trapezoid Area: " + trapezoid.getArea());

        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 5, 3);
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        Rectangle rectangle = new Rectangle(p1, p2, p3, p4, 6, 4);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Square square = new Square(p1, p2, p3, p4, 4);
        System.out.println("Square Area: " + square.getArea());
    }
}
