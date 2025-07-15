import java.util.Scanner;

public class n94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, temp;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int arr[] = new int[n];

        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] % 2 == 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
        System.out.print("Rearrange array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
