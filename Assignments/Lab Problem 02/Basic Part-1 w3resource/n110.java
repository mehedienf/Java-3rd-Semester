import java.util.Scanner;

public class n110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, flag = 0;
        System.out.print("Input a number: ");
        num = input.nextInt();

        for (int i = 4; i <= num; i *= 4) {
            if (i == num) {
                flag = 1;
            }
        }

        System.out.println(num + " is power of 4: " + (flag == 1));
        input.close();
    }
}
