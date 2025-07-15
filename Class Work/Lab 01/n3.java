class Shape {
    int getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    int getArea(int a, int b) {
        int result = a * b;
        return result;
    }
}
public class n3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea(3, 4));
    }
}
