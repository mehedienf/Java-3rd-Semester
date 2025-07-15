import java.util.Scanner;

public class n58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();
        System.out.print("Capitalized string: ");
        for (int i = 0; i < x.length(); i++) {
            if (i != 0) {
                if (x.charAt(i) == ' ') {
                    System.out.print(" " + x.toUpperCase().charAt(i+1));
                    i++;
                }
                else {
                    System.out.print(x.charAt(i));
                }
            }
            else {
                System.out.print(x.toUpperCase().charAt(0));
            }
        }
        System.out.println();
        input.close();
    }
}
