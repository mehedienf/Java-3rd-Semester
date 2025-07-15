import java.util.Scanner;

public class n185 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a, b;
        System.out.print("Input first string: ");
        a = input.nextLine();
        System.out.print("Input second string: ");
        b = input.nextLine();

        System.out.println("is " + a + " and " + b + " are isomorphic? : " + ((a.charAt(0) == a.charAt(a.length()-1)) && (b.charAt(0) == b.charAt(b.length()-1))));

        input.close();
    }
}
