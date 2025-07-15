import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input series length: ");
        int n = sc.nextInt();
        int firstNumber = 0, secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber);
        for (int i = 2; i < n; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        sc.close();
    }
}