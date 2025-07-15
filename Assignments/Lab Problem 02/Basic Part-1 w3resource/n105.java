import java.util.Scanner;

public class n105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Input array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (i == arr.length-1) {
                System.out.println(arr[i] == arr[0]);
            }
        }
        input.close();
    }
}
