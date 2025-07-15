import java.util.Scanner;

public class n162 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double avg = 0;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index[%d]- ", i);
            arr[i] = input.nextInt();
            avg += arr[i];
        }
        avg /= arr.length;
        System.out.println("Average is: " + avg);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
