class Animal {
    void makeSound() {

    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat bark mew.");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}