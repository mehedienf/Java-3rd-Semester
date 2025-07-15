import java.util.Scanner;

public class n179 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum = 0;
        System.out.print("Input an array length: ");
        n = input.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Input the Array element:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Array[%d]- ", i);
            arr1[i] = input.nextInt();
            if (i == 0) {
                sum = arr1[i];
            }
            else {
                sum *= 10;
                sum += arr1[i];
            }
        }
        // sum /= 10;
        sum++;
        String num = Integer.toString(sum);
        // System.out.println(num);
        int[] arr2 = new int[num.length()];
        System.out.print("Array of digits: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Character.getNumericValue(num.charAt(i));
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
