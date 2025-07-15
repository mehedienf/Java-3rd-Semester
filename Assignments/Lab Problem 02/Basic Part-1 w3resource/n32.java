import java.util.Scanner;

public class n32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        else if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(a + " is less than " + b);
        }
        input.close();
    }
}
