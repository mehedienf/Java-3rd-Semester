import java.util.Scanner;

public class n49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an integer: ");
        n = input.nextInt();
        System.out.println(n % 2 != 0? 0 : 1);

        input.close();
    }
}