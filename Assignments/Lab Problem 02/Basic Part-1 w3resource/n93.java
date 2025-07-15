import java.util.Scanner;

public class n93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, count10 = 0, count20 = 0, flag = 0;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int arr[] = new int[n];

        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element-" + i + ": ");
            arr[i] = input.nextInt();
            if (arr[i] == 10) {
                count10++;
            }
            else if (arr[i] == 20) {
                count20++;
            }
            else {
                count10 = 0;
                count20 = 0;
            }
            if (count10 == 2 || count20 == 2) {
                flag = 1;
            }
        }
        System.out.println("Result: " + (flag == 1));
        input.close();
    }
}
