import java.util.Scanner;

public class n168 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, multiply = 0;
        System.out.print("Input first integer: ");
        a = input.nextInt();
        System.out.print("Input second integer: ");
        b = input.nextInt();
        if (b < a) {
            for (int i = 0; i < b; i++) {
                multiply += a;
            }
        }
        else {
            for (int i = 0; i < a; i++) {
                multiply += b;
            }
        }
        System.out.println("Multiply result = " + multiply);
        input.close();
    }
}
