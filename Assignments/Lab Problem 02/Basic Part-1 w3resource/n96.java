import java.util.Scanner;

public class n96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, flag = 0, flag2 = 0;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (arr[i] == 10 || flag == 1) {
                flag = 1;
                if (flag == 1) {
                    if (arr[i] == 20) {
                        flag2 = 1;
                    }
                }
            }
        }
        System.out.println("Result: " + (flag2 == 1));
        input.close();
    }
}
