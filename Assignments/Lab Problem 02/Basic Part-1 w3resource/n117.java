import java.util.Scanner;

public class n117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an integer: ");
        n = input.nextInt();

        System.out.printf("The square root of %d is: %s\n", n, Math.sqrt(n));
        input.close();
    }
}
