import java.util.Scanner;

public class n176 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, temp;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Input the Array element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array[%d]- ", i);
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] % 2 != 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
