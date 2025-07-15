import java.util.Scanner;

public class n161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, smallest, largest;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index[%d]- ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("you want to find within 0 to- ");
        k = input.nextInt();

        smallest = arr[0];
        largest = arr[0];
        for (int i = 0; i < k; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest elements between 0 to " + k +": " + smallest);
        System.out.println("Largest elements between 0 to " + k +": " + largest);

        input.close();
    }
}
