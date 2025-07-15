import java.util.Scanner;

public class n80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[3];
        System.out.println("Input array element:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr[i] = input.nextInt();
        }
        if (arr[0] > arr[2]) {
            System.out.println("Larger value between first and last element: " + arr[0]);
        }
        else if (arr[0] < arr[2]) {
            System.out.println("Larger value between first and last element: " + arr[2]);
        } 
        input.close();
    }
}
