import java.util.Scanner;

public class n115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, pSum = 0, temp = 0, flag = 0;
        System.out.print("Input a number: ");
        n = input.nextInt();
        if (n == 0) {
            System.out.println(n + " is a palindrome number: " + (flag == 0));
        }
        else {
            for (int i = 1; i <= n; ) {
                pSum += temp;
                temp = i;
                i = pSum;
                if (pSum == n) {
                    flag = 1;
                }
            }
            System.out.println(n + " is a palindrome number: " + (flag == 1));
        }
        
        // input.close();
    }
}