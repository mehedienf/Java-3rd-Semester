import java.util.Scanner;

public class n64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.print("Input first integer: ");
        a = input.nextInt();
        System.out.print("Input second integer: ");
        b = input.nextInt();
        if (a >= 15 && a <= 75 && b <= 75 && b >= 15) {
            System.out.println("Result: " + ((a % 10 == b % 10) || (a / 10 == b / 10) || (a % 10 == b / 10) || (a / 10 == b % 10)));
        }
        input.close();
    }
}
