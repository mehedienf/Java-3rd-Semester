import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, x, y, d;
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        System.out.print("Input c: ");
        c = input.nextDouble();
        d = (b*b-4*a*c);

        if (d > 0) {
            x = (-b + Math.pow(d, 0.5)) / (2*a);
            y = (-b - Math.pow(d, 0.5)) / (2*a);
            System.out.println("The roots are " + x + " and " + y);
        }
        else if (d == 0) {
            System.out.println("The roots are " + ((-b) / (2*a)));
        }
        else {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }
}
