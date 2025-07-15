import java.util.Scanner;

public class n75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        if (n >= 2) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Index- %d: ", i);
                arr[i] = input.nextInt();
            }
            System.out.println(arr[0] == arr[n-1]); 
        }
        else {
            System.out.println("Wrong array length. Array length must be greater than 1.");
        }
        input.close();
    }
}
