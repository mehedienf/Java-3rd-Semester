import java.util.Scanner;

public class n18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Input first binary number: ");
        a = input.nextInt();
        System.out.print("Input second binary number: ");
        b = input.nextInt();
        System.out.println("Pproduct of two binary number: "+ (a*b));
        input.close();
    }
}
