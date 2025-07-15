import java.util.Scanner;

public class n178 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, tempCount = 1, count = 1;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the Array element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array[%d]- ", i);
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] + 1 == arr[i+1]) {
                tempCount++;
                if (tempCount > count) {
                    count++;
                }
            }
            else {
                tempCount = 1;
            }
        }
        System.out.println("Size of longest increasing continuous subsequence: " + count);
        input.close();
    }
}
