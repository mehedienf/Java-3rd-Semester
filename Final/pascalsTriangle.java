public class pascalsTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in Pascal's Triangle

        // Create a 2D array to store the triangle
        int[][] triangle = new int[rows][rows];

        // Initialize the first row with 1
        triangle[0][0] = 1;

        // Generate the remaining rows of the triangle
        for (int i = 1; i < rows; i++) {
            triangle[i][0] = 1; // First element of each row is 1

            for (int j = 1; j <= i; j++) {
                // Calculate the value using the previous row's elements
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}