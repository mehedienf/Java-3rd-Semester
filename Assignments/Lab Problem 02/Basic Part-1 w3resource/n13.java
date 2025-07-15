import java.util.Scanner;

public class n13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Input Width: ");
        a = input.nextDouble();
        System.out.print("Input height: ");
        b = input.nextDouble();
        System.err.println("Area is: " + (a*b));
        System.err.println("Perimeter is: " + 2*(a+b));
        input.close();
    }
}
