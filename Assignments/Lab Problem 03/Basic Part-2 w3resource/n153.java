import java.util.Scanner;

public class n153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;
        System.out.print("Input first number: ");
        a = input.nextDouble();
        System.out.print("Input second number: ");
        b = input.nextDouble();

        System.out.println((a == 0 || a == 1) && (b == 0 || b == 1));

        input.close();
    }
}
