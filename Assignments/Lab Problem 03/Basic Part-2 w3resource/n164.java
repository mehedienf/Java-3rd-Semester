import java.util.Scanner;

public class n164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int divident, divider, count = 0;
        double point = 0;
        System.out.print("Input the dividend: ");
        divident = input.nextInt();
        System.out.print("Input the divider: ");
        divider = input.nextInt();

        for (int i = divident; i >= divider; ) {
            i -= divider;
            count++;
            if (i < divider) {
                point = (double)i / (double)divider;
            }
        }
        System.out.println(count + point);

        input.close();
    }
}
