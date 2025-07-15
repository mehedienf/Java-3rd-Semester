import java.util.Scanner;

public class n113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        System.out.print("Input first array length: ");
        n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Input first array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Index-%d: ", i);
            arr1[i] = input.nextInt();
        }
        System.out.print("Input second array length: ");
        n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Input second array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Index-%d: ", i);
            arr2[i] = input.nextInt();
        }
        
        int[] arr3 = new int[n1 + n2];
        
        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j];
        }
        for (int j = arr1.length, i = 0; j < arr3.length; j++, i++) {
            arr3[j] = arr2[i];
        }
        int temp;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j] >= arr3[i]) {
                    temp = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        System.out.print("new array is: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] +" ");
        }
        System.out.println();

        input.close();
    }
}
