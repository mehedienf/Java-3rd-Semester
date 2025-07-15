import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        float n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an floating point number: ");
        n1 = scanner.nextFloat();
        System.out.print("Input another floating point number: ");
        n2 = scanner.nextFloat();
        if (n1 == n2) {
            System.out.println("They are same.");
        }
        else {
            System.out.println("They are different");
        }
        scanner.close();
    }
}