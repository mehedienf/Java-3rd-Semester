public class n50 {
    public static void main(String[] args) {
        System.out.println("Divisible by 3:");
        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\nDivisible by 5:");
        for (int i = 3; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\nDivisible by 3:");
        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }
}
