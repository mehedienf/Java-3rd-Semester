import java.util.Scanner;

public class n21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Input a decimal number: ");
        a = input.nextInt();
        System.out.println("Octal number is: " + Integer.toOctalString(a));
        input.close();
    }
}
