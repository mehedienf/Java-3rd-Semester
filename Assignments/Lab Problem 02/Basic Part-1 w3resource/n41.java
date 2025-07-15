import java.util.Scanner;

public class n41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a character: ");
        x = input.nextLine();

        System.out.println("ASCII value: " + (int)(x.charAt(0)));
        
        input.close();
    }
}