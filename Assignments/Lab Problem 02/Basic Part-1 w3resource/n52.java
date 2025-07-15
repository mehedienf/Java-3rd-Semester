import java.util.Scanner;

public class n52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Input first integer: ");
        a = input.nextInt();
        System.out.print("Input second integer: ");
        b = input.nextInt();
        System.out.print("Input third integer: ");
        c = input.nextInt();
        
        System.out.println("The result is: " + (a+b == c));

        input.close();
    }
}
