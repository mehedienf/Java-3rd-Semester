class Shape {
    void getPerimeter() {
        System.out.println("This is perimeter.");
    }
    void getArea() {
        System.out.println("This is area.");
    }
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    void getPerimeter() {
        System.out.println("Perimeter = "+(Math.PI*2*r));
    }
    void getArea() {
        System.out.println("Area = "+ (Math.PI*r*r));
    }
}

public class n8 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.getPerimeter();
        circle.getArea();
    }
}
