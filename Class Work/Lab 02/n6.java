class Shape {
    void ShapeMethod() {
        System.out.println("This is shape.");
    }
}
class Rectangle extends Shape {
    void rectangleMethod() {
        System.out.println("This is rectangle shape.");
    }
}
class Circle extends Shape {
    void circleMethod() {
        System.out.println("This is circle shape.");
    }
}
class Square extends Rectangle {
    void SquareMethod() {
        System.out.println("Square of rectangle");
    }
}

public class n6 {
    public static void main(String[] args) {
        Square square = new Square();
        square.ShapeMethod();
        square.rectangleMethod();
    }
}
