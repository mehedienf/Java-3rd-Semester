import java.util.Scanner;

public class n183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, count = 0;
        System.out.print("Input an positive integer: ");
        n = input.nextInt();

        for (int i = n; i > 0; ) {
            count += i % 10;
            i = i / 10;
        }
        System.out.println("Result: " + count);
        input.close();
    }
}
