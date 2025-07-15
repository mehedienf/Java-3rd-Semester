import java.util.Scanner;

public class n74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Input array length (greater than 1): ");
        n = input.nextInt();
        int x[] = new int[n];
        System.out.println("Input array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Index-" + i + " : ");
            x[i] = input.nextInt();
        }
        System.out.println(n >= 2 ? (x[0] == 10 || x[n-1] == 10) : "Wrong input!");
        input.close();
    }
}
