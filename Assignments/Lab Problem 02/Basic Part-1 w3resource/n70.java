import java.util.Scanner;

public class n70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x1, x2;
        System.out.print("Input short string: ");
        x1 = input.nextLine();
        System.out.print("Input long string: ");
        x2 = input.nextLine();

        System.out.println("Result: " + (x1.length() != x2.length() ? (x1 + x2 + x1) : "Wrong input!"));
        input.close();
    }
}
