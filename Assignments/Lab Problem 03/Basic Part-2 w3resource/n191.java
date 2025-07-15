import java.util.Scanner;

public class n191 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, flag = 0;
        System.out.print("Input a positive integer: ");
        n = input.nextInt();

        for (int i = 1; i*i <= n; i++) {
            for (int j = 1; ((i*i) + (j*j)) <= n; j++) {
                if (((i*i) + (j*j)) == n) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        System.out.println("Is " + n + " sum of two square numbers? " + (flag == 1));
        input.close();
    }
}
