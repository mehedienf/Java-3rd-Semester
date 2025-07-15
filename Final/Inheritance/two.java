class Parent {
    private void methodOne() {
        System.out.println("This is parent class.");
    }
}
class Child extends Parent {
    void methodTwo() {
        System.out.println("This is child class");
    }
}

public class two {
    public static void main(String args[]) {
        Parent parent = new Parent();
        parent.methodOne();
        Child child = new Child();
        child.methodTwo();
        // child.methodOne();
    }
}
