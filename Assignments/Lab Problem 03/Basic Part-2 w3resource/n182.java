import java.util.Scanner;

public class n182 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a, b, c;
        System.out.print("Input binary number a: ");
        a = input.nextLine();
        System.out.print("Input binary number b: ");
        b = input.nextLine();
        System.out.print("Input binary number c: ");
        c = input.nextLine();

        System.out.println("Comparing TreeNode a and TreeNode b: " + (a.compareTo(b) == 0 ? "true" : "false"));
        System.out.println("Comparing TreeNode b and TreeNode c: " + (b.compareTo(c) == 0 ? "true" : "false"));

        input.close();
    }
}
