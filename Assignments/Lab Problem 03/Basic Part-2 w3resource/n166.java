import java.util.Scanner;

public class n166 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Input an integer: ");
        a = input.nextInt();
        System.out.println("String format of the saided integer: " + Integer.toString(a));
        input.close();
    }
}
