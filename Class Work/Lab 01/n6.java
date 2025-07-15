class Animal {
    void move() {
        System.out.println("Animal move");
    }
}
class Cheetah extends Animal {
    void move() {
        System.out.println("Cheetah move");
    }
}

public class n6 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
