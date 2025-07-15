import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Input a number: ");
        a = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, a*i);
        }
        input.close();
    }
}