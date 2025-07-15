class Vehicle {
    void dirve() {

    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car.");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
