import java.util.Scanner;

public class n158 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, flag1 = 0, flag2 = 0;
        System.out.print("Input array row and column (m x n): ");
        m = input.nextInt();
        n = input.nextInt();
        boolean[][] arr = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flag1 = 0;
                flag2 = 0;
                if (i <= 1 || j <= 1) {
                    flag1 = 1;
                    flag2 = 1;
                }
                else {
                    for (int j2 = 2; j2 < 100; j2++) {
                        if ((i % j2 == 0) && (i != j2)) {
                            flag1 = 1;
                        }
                        if ((j % j2 == 0) && (j != j2)) {
                            flag2 = 1;
                        }
                    }
                }
                if (flag1 == 1 || flag2 == 1) {
                    arr[i][j] = true;
                }
                else
                {
                    arr[i][j] = false;
                }
            }
        }
        System.out.println("array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
