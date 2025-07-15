import java.util.Arrays;
import java.util.Scanner;

public class n81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, temp;
        System.out.print("Input array length: ");
        n = input.nextInt();
        if (n >= 1) {
            int arr[] = new int[n];
            System.out.println("Input array element:");
            for (int i = 0; i < n; i++) {
                System.out.printf("Element-%d: ", i+1);
                arr[i] = input.nextInt();
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            temp = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = temp;
            System.out.println("New array after swaping the first and last elements: " + Arrays.toString(arr));
        }
        else {
            System.out.println("Wrong array length. Array length must be greater than 0.");
        }
        input.close();
    }
}
