import java.util.Scanner;

public class n20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Input a decimal number: ");
        a = input.nextInt();
        System.err.println("Hexa decimal is: " + Integer.toHexString(a).toUpperCase());
        input.close();
    }
}
