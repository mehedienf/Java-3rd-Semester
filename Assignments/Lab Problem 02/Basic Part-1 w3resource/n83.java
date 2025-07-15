import java.util.Scanner;

public class n83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int arr1[] = new int[n], arr2[] = new int[n];

        System.out.println("Input first array element:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr1[i] = input.nextInt();
        }
        System.out.println("Input second array element:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr2[i] = input.nextInt();
        }
        System.out.print("Result: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i]*arr2[i] + " ");
        }
        System.out.println("");
        input.close();
    }
}
