class Shape {
    void getArea() {

    }
}
class Rectangle extends Shape {
    int length;
    int width;
    public void getArea() {
        System.out.println("Area of the rectangle: " + length*width);
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(25);
        rectangle.getArea();
    }
}