import java.util.Scanner;

public class n174 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, largest;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index [%d]- ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Value of k: ");
        k = input.nextInt();
        System.out.print("new array: ");

        for (int i = 1; i < (arr.length - (k / 2)); i++) {
            largest = arr[i-1];
            for (int j = i-1; j < i + k - 1; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                }
            }
            System.out.print(largest + " ");
        }
        System.out.println();
        input.close();
    }
}
