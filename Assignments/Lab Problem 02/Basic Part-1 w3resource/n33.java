import java.util.Scanner;

public class n33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, sum = 0, temp;
        System.out.print("Input a number: ");
        a = input.nextInt();

        for (int i = a; i > 0; ) {
            temp = i % 10;
            sum += temp;
            i -= temp;
            i /= 10;
        }
        System.out.println("Sum = "+sum);
        input.close();
    }
}
