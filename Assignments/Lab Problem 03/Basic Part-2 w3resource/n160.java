import java.util.Scanner;

public class n160 {
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
        System.out.print("How much smallest element you want to find: ");
        n2 = input.nextInt();
        int[] sElement = new int[n2];
        
        for (int i = 0; i < n2; i++) {
            sElement[i] = 999999999;
            for (int j = 0; j < arr.length; j++) {
                if (i > 0) {
                    if (arr[j] < sElement[i] && arr[j] > sElement[i-1]) {
                        sElement[i] = arr[j];
                    }
                }
                else {
                    if (arr[j] < sElement[i]) {
                        sElement[i] = arr[j];
                    }
                }
                
            }
            
        }
        System.out.print(n2 + "Smallest elements of the said array are: ");
        for (int i = 0; i < sElement.length; i++) {
            System.out.print(sElement[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
