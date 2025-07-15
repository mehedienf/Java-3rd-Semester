import java.util.Scanner;

public class n106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
        }
        
        System.out.print("New array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // input.close();
    }
}
