import java.util.Scanner;

public class n76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input array length: ");
        n = input.nextInt();
        if (n >= 2) {
            int arr1[] = new int[n], arr2[] = new int[n];
            System.out.println("Input first array element:");
            for (int i = 0; i < n; i++) {
                System.out.printf("Element-%d: ", i+1);
                arr1[i] = input.nextInt();
            }
            System.out.println("Input second array element:");
            for (int i = 0; i < n; i++) {
                System.out.printf("Element-%d: ", i+1);
                arr2[i] = input.nextInt();
            }
            System.out.println(arr1[0] == arr1[n-1] && arr2[0] == arr2[n-1]); 
        }
        else {
            System.out.println("Wrong array length. Array length must be greater than 1.");
        }
        input.close();
    }
}
