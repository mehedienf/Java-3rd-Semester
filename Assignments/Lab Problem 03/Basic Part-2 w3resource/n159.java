import java.util.Scanner;

public class n159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, n2;
        System.out.print("Input array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index[%d]- ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("How much large element you want to find: ");
        n2 = input.nextInt();
        int[] lElement = new int[n2];

        for (int i = 0; i < n2; i++) {
            lElement[i] = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (i > 0) {
                    if (arr[j] > lElement[i] && arr[j] < lElement[i-1]) {
                        lElement[i] = arr[j];
                    }
                }
                else {
                    if (arr[j] > lElement[i]) {
                        lElement[i] = arr[j];
                    }
                }
            }
        }
        System.out.print(n2 + "largest elements of the said array are: ");
        for (int i = 0; i < lElement.length; i++) {
            System.out.print(lElement[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
