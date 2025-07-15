import java.util.Scanner;

public class n120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, sm, sn;
        System.out.print("Input mattrix row: ");
        m = input.nextInt();
        System.out.print("Input mattrix column: ");
        n = input.nextInt();
        int[][] matt = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("matt[%d][%d]: ", i, j);
                matt[i][j] = input.nextInt();
            }
        }
        System.out.print("Which element you want to search(m x n): ");
        sm = input.nextInt();
        sn = input.nextInt();
        System.out.println("The value is: " + matt[sm][sn]);

        input.close();
    }
}
