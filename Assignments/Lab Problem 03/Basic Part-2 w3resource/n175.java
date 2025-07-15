import java.util.Scanner;

public class n175 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Input the Array element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array[%d]- ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Input the node you want to delete: ");
        int node;
        node = input.nextInt();

        int[] arr2 = new int[n-1];
        for (int i = 0; i < arr2.length; i++) {
            if (i >= node-1) {
                arr2[i] = arr[i+1];
            }
            else {
               arr2[i] = arr[i]; 
            }
        }
        System.out.print("New array is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
