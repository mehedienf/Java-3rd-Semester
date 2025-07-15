import java.util.Scanner;

public class n108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.print("Input an integer: ");
        String x, num = "0123456789";
        x = input.nextLine();

        for (int i = x.length()-1; i > 0; i--) {
            for (int j = 0; j <= 9; j++) {
                if (x.charAt(i) == num.charAt(j)) {
                    sum += j;
                }
            }
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}