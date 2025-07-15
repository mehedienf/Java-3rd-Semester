class Shape {
    void ShapeMethod() {
        System.out.println("This is shape.");
    }
}
class Rectangle extends Shape {
    void rectangleMethod() {
        System.out.println("This is rectangular shape.");
    }
}
class Circle extends Shape {
    void circleMethod() {
        System.out.println("This is circle shape.");
    }
}
class Square extends Rectangle {
    void squareMethod() {
        System.out.println("Square is a rectangle.");
    }
}

public class six {
    public static void main(String[] args) {
        Square square = new Square();

        square.ShapeMethod();
        square.rectangleMethod();
    }
}
