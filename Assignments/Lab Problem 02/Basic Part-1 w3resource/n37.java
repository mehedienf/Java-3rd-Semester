import java.util.Scanner;

public class n37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();
        StringBuilder rx = new StringBuilder(x);
        System.out.println("Reverse string: " + rx.reverse());
        input.close();
    }
}
