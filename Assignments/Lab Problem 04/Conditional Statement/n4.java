import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        float n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        n = input.nextFloat();

        if (n == 0) {
            System.out.println("Zero.");
        }
        else {
            if (n > 0 && Math.abs(n) > 1000000) {
                System.out.println("Positive large.");
            }
            else if (n < 0 && Math.abs(n) > 1000000) {
                System.out.println("Negative large");
            }
            else if (n < 0 && Math.abs(n) < 1) {
                System.out.println("Negative small");
            }
            else if (n < 0) {
                System.out.println("Negative");
            }
            else if (n > 0) {
                System.out.println("Negative");
            }
        }
        input.close();
    }
}
