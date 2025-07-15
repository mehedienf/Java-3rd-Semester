import java.util.Scanner;

public class n104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, flag = 0, count = -1;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Input array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (arr[i] == 10 && flag == 0) {
                flag = 1;
                count = i;
            }
        }
        int arr2[] = new int[count];
        System.out.print("New array is: ");
        for (int i = 0, j = 0; i < count; i++, j++) {
            arr2[j] = arr[i];
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        input.close();
    }
}
