import java.util.Scanner;

public class n184 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input series length: ");
        n = input.nextInt();

        // String[][] binaryStrings = new String[1][n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Input binary number %d: ", i);
            // binaryStrings[0][i] = input.nextLine();
            // System.out.println(i);
            arr[i] = input.nextInt();
        }
        // System.out.println(binaryStrings);
        System.out.println(Integer.toBinaryString(arr[0]));
    }
}
