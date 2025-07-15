class Vehicle {
    void drive() {

    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}
public class n2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
