import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Input an integer, a: ");
        a = input.nextInt();
        System.out.print("Input an integer, b: ");
        b = input.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.printf("After swap: a = %d and b = %d\n", a, b);
        input.close();
    }
}
