import java.util.Scanner;

public class n84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();
        if (x.length() > 3) {
            System.out.println(x.substring(x.length()-3, x.length())+x+x.substring(x.length()-3, x.length()));
        }
        else {
            System.out.println("Wrong string length. String length must be greater than three.");
        }
        input.close();
    }
}
