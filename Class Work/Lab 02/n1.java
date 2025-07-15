class class1 {
    void method1() {
        System.out.println("This is parent class.");
    }
}
class class2 extends class1{
    void method2() {
        System.out.println("This is child class.");
    }
}

public class n1 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.method1();
        class2 c2 = new class2();
        c2.method2();
        c2.method1();
    }
}