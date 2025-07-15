import java.util.Scanner;

public class n173 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
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
        for (int i = k / 2; i < arr.length - (k / 2); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
