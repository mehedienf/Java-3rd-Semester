import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, sum = 0;
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }
}
