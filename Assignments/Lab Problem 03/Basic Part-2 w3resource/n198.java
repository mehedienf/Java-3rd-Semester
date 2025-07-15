import java.util.Scanner;

public class n198 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeNumber, flag = 0, count = 0;
        System.out.print("Input a positive integer: ");
        primeNumber = input.nextInt();

        for (int i = 2; i <= primeNumber; i++) {
            flag = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j == 0) && (i != j)) {
                    flag = 1;
                    break;
                }
                else {
                    flag = 0;
                    // break;
                }
            }
            if (flag == 0) {
                count++;
                // System.out.println(i + " ");
            }
            if ((flag == 0) && (i == primeNumber)) {
                // System.out.println(count);
                break;
            }
        }
        System.out.println("Position of the said Prime number: " + count);
        input.close();
    }
}
