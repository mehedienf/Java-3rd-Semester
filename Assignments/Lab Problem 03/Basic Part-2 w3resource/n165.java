import java.util.Scanner;

public class n165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, temp;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index[%d]- ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Old array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.print("\nNew array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
