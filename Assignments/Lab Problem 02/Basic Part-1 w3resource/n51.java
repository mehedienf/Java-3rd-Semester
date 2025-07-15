import java.util.Scanner;

public class n51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        String x, number = "0123456789";
        System.out.print("Input a number(string): ");
        x = input.nextLine();
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (x.charAt(i) == number.charAt(j)) {
                    
                    n = n * 10;
                    n = n + j;
                    break;
                }
            }
        }
        System.out.println("Integer value: " + n);

        input.close();
    }
}