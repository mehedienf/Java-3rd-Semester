import java.util.Scanner;

public class n114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, temp;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index-%d: ", i);
            arr[i] = input.nextInt();
        }
        for (int i = 0, j = arr.length - 1; i < (arr.length / 2); i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("rotated array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        input.close();
    }
}
