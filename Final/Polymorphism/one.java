class Shape {
    void show() {
        System.out.println("This is a shape");
    }
    void getInfo() {
        System.out.println("Class Name: Shape");
    }
}
class Circle extends Shape {
    void show() {
        System.out.println("This is a circle");
    }
    void getInfo() {
        System.out.println("Class Name: Circle");
    }
}
class Rectangle extends Shape {
    void show() {
        System.out.println("This is a Recangle");
    }
    void getInfo() {
        System.out.println("Class Name: Recangle");
    }
}
public class one {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Shape();
        shape[1] = new Circle();
        shape[2] = new Rectangle();

        for (Shape s : shape) {
            s.show();
            s.getInfo();
        }
    }
}