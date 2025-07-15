import java.util.Scanner;
public class n12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();
        System.out.print("Input third number: ");
        c = input.nextInt();
        System.err.println("Average is: " + (a+b+c) / 3);
        input.close();
    }
}