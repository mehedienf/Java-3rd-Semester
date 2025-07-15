import java.util.Scanner;

public class n92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, evnCount = 0, oddCount = 0;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (arr[i] % 2 == 0) {
                evnCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Even number in array: " + evnCount + "\nOdd number in array: " + oddCount);
        input.close();
    }
}