import java.util.Scanner;

public class n72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();
        if (x.length() >= 3) {
            System.err.println("Result: " + x.substring(0, 3));
        }
        else if (x.length() == 2) {
            System.out.println("Result: " + x + "#");
        }
        else if (x.length() == 1) {
            System.out.println("Result: " + x + "##");
        }
        else {
            System.out.println("Result: " + x + "###");
        }
        input.close();
    }
}
