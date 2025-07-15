class Shape {
    void show() {
        System.out.println("This is a Shape.");
    }
    void getInfo() {
        System.out.println("Class: " + getClass().getSimpleName());
    }
}
class Circle extends Shape {
    void show() {
        System.out.println("This is a Circle.");
    }
}
class Rectangle extends Shape {
    void show() {
        System.out.println("This is a Rectangle.");

    }
}

public class n1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shape.show();
        shape.getInfo();

        circle.show();
        circle.getInfo();

        rectangle.show();
        rectangle.getInfo();
    }
}