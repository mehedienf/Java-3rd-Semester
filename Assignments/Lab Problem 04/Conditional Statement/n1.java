import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an integer: ");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is positive.");
        }
        input.close();
    }
}