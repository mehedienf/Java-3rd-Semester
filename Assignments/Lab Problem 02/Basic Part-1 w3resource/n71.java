import java.util.Scanner;

public class n71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x1, x2;
        System.out.print("Input short string: ");
        x1 = input.nextLine();
        System.out.print("Input long string: ");
        x2 = input.nextLine();

        System.out.println("Result: " + x1.substring(1) + x2.substring(1));
        input.close();
    }
}
