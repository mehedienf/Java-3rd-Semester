import java.util.Scanner;

public class n73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x1, x2;
        System.out.print("Input first string: ");
        x1 = input.nextLine();
        System.out.print("Input second string: ");
        x2 = input.nextLine();

        System.out.println("Result: " + (x1.length() >= 1 ? x1.charAt(0) : "#") + (x2.length() >= 1 ? x2.charAt(x2.length()-1) : "#"));
        input.close();
    }
}
