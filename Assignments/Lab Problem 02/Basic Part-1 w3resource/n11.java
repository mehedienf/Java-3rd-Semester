import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        System.out.print("Input radius: ");
        r = input.nextDouble();
        System.out.println("Perimeter is: " + (2*Math.PI*r));
        System.out.println("Perimeter is: " + (Math.PI*r*r));
        input.close();
    }
}
