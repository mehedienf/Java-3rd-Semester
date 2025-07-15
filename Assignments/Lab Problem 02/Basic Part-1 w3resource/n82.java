import java.util.Arrays;
import java.util.Scanner;

public class n82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input array length: ");
        n = input.nextInt();
        if (n % 2 != 0) {
            int arr[] = new int[n];
            System.out.println("Input array element:");
            for (int i = 0; i < n; i++) {
                System.out.printf("Element-%d: ", i+1);
                arr[i] = input.nextInt();
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            if (arr[0] > arr[n-1] && arr[0] > arr[n/2]) {
                System.out.println("Largest element between first, last, and middle values: " + arr[0]);
            }
            else if (arr[0] < arr[n-1] && arr[n-1] > arr[n/2]) {
                System.out.println("Largest element between first, last, and middle values: " + arr[n-1]);
            }
            else {
                System.out.println("Largest element between first, last, and middle values: " + arr[n/2]);
            } 
        }
        else {
            System.out.println("Wrong array length. Array length must be odd.");
        }
        input.close();
    }
}
