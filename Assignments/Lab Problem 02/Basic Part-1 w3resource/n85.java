import java.util.Scanner;

public class n85 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();
        System.out.println(x.startsWith("Hello"));
        input.close();
    }
}
