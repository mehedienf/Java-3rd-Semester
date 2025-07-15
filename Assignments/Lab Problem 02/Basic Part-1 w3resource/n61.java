import java.util.Scanner;

public class n61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input a word: ");
        x = input.nextLine();
        for (int i = x.length()-1; i >= 0; i--) {
            System.out.print(x.charAt(i));
        }
        System.out.println();
        input.close();
    }
}
