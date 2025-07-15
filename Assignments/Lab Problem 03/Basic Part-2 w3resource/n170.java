import java.util.Scanner;

public class n170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, count = 1, flag = 1;
        System.out.print("Input series length: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Index [%d]- ", i);
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i] == arr[i+1]) || (arr[i+1] == (arr[i] + 1))) {
                count++;
                if (count > flag) {
                    flag = count;
                }
            }
            else {
                count = 1;
            }
            
        }
        System.out.println("Longest consecutive sequence in the given array: " + flag);
        input.close();
    }
}