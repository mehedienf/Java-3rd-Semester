import java.util.Scanner;

public class n86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input an integer: ");
        n = input.nextInt();
        input.close();
        for (int i = n; ; ) {
            if (i % 2 == 0) {
                i = i/2;
            }
            else {
                i += 1;
            }
            System.out.println(i);
            if (i == 1) {
                break;
            }
        }
    }
}