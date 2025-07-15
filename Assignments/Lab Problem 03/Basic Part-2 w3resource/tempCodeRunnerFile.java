import java.util.Scanner;

public class n155 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Input array row and column (m x n): ");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr1 = new int[m][n], arr2 = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Array [%d][%d]- ", i, j);
                arr1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("Original array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("new array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
