import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();
        System.out.print("Input third number: ");
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("The greatest number is : " + a);
        }
        else if (b > a && b > c) {
            System.out.println("The greatest number is : " + b);
        }
        else {
            System.out.println("The greatest number is : " + c);
        }
        input.close();
    }
}
