import java.util.Scanner;

public class n69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        System.out.print("Input an even string: ");
        x = input.nextLine();
        System.out.println(x.length() % 2 == 0 ? x.substring(0, x.length()/2) : "wrong input!");
        input.close();
    }
}