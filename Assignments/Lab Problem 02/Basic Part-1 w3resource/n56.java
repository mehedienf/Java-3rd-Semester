import java.util.Scanner;

public class n56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, p, count = 0;
        System.out.print("Input starting integer (x): ");
        x = input.nextInt();
        System.out.print("Input ending integer (y): ");
        y = input.nextInt();
        System.out.print("Input divisible integer (p): ");
        p = input.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                count++;
            }
        }
        System.out.println("NUmber within x and y which is divisible by p: " + count);
        input.close();
    }
}
