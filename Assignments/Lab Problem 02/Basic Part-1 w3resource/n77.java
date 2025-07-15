import java.util.Scanner;

public class n77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr1[] = new int[3], arr2[] = new int[3];
        System.out.println("Input first array element:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr1[i] = input.nextInt();
        }
        System.out.println("Input second array element:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Element-%d: ", i+1);
            arr2[i] = input.nextInt();
        }
        System.out.printf("New array: [%d, %d]\n", arr1[0],arr2[2]); 
        input.close();
    }
}
