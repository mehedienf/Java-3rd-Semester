import java.util.Scanner;

public class n180 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, temp;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Input the Array element:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Array[%d]- ", i);
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr1.length-1; i += 2) {
            temp = arr1[i];
            arr1[i] = arr1[i+1];
            arr1[i+1] = temp;
        }

        System.out.print("New array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
