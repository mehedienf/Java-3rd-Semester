import java.util.Scanner;

public class n59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a string containing capital word: ");
        x = input.nextLine();
        System.out.println("Lowercase string is: " + x.toLowerCase());
        input.close();
    }
}
