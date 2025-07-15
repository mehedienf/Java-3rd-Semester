class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat make sound mew");
    }
}
public class n1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}