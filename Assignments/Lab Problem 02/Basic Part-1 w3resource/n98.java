import java.util.Scanner;

public class n98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, flag = 0, count = 0;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (i >= 1) {
                if (arr[i] == 20 && arr[i-1] == 20) {
                    flag = 1;
                }
            }
            if (arr[i] == 20) {
                count++;
            }
        }
        System.out.println("Result: " + (count > 2 && flag == 0));
        input.close();
    }
}
