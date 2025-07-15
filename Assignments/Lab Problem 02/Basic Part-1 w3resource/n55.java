import java.util.Scanner;

public class n55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seconds;
        System.out.print("Input seconds: ");
        seconds = input.nextInt();
        System.out.printf("%d:%d:%d\n", seconds/3600, (seconds%3600)/60, (seconds%3600)%60);
        input.close();
    }
}
