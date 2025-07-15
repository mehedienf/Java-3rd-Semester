import java.util.Scanner;

public class n194 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        System.out.print("Input a number to find the position: ");
        int position = input.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == position) {
                    System.out.printf("Position is: (%d,%d)\n", i, j);
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Number not found!");
        }
        input.close();
    }
}