import java.util.Scanner;

public class n60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, count2 = 0;
        String x;
        System.out.print("Input a string: ");
        x = input.nextLine();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                count++;
            }
        }
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ' ) {
                count2++;
            }
            if (count2 >= count-1 && count2 < count) {
                System.out.print(x.charAt(i));
            }
        }
        System.out.println();
        // input.close();
    }
}
