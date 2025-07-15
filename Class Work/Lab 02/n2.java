class class1 {
    private void method1() {
        System.out.println("This is parent class.");
    }
    // void method3() {
    //     method1();
    // }
}
class class2 extends class1{
    void method2() {
        System.out.println("This is child class.");
    }
}

public class n2 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.method1();
        // c1.method3();
        class2 c2 = new class2();
        c2.method2();
    }
}