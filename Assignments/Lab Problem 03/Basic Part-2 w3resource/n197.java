import java.util.Scanner;

public class n197 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, flag = 0;
        n = input.nextInt();

        for (int j = 0; j <= n; j++) {
            if (j*j == n) {
                System.out.println("Is the said number perfect square? " + (j*j == n));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Is the said number perfect square? " + (flag != 0));
        }
        input.close();
    }
}