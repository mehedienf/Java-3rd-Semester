import java.util.Scanner;

public class n79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        int arr[] = new int[3];
        System.out.println("Input array element:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.printf("Original array: [%d, %d, %d]\n", arr[0], arr[1], arr[2]);
        for (int i = 0; i < 2; i++) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.printf("Rotated array: [%d, %d, %d]\n", arr[0], arr[1], arr[2]);
        input.close();
    }
}
