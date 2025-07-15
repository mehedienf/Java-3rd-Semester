import java.util.Scanner;

public class n78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[2];
        System.out.println("Input array element:");
        for (int i = 0; i < 2; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.println(arr[0] == 4 || arr[1] == 7 || arr[0] == 7 || arr[1] == 4);
        input.close();
    }
}
