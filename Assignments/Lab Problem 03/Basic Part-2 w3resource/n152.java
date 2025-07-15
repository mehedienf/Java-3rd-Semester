import java.util.Scanner;

public class n152 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d;
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();
        System.out.print("Input third number: ");
        c = input.nextInt();
        System.out.print("Input fourth number: ");
        d = input.nextInt();

        System.out.println(a == b && a == c && a == d ? "Numbers are equal!" : "Numbers are not equal!");
        input.close();
    }
}
