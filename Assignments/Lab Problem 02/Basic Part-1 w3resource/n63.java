import java.util.Scanner;

public class n63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.print("Input first integer: ");
        a = input.nextInt();
        System.out.print("Input second integer: ");
        b = input.nextInt();

        if (a != b) {
            if (a % 6 == b % 6) {
                System.out.println("Result: " + (a < b ? a : b));
            }
            else {
                System.out.println("Result: " + (a > b ? a : b));
            }
        }
        else {
            System.out.println("Result: " + 0);
        }
        input.close();
    }
}
