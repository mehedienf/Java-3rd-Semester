import java.util.Scanner;

public class n44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Input an integer: ");
        n = input.nextInt();

        System.out.println(n + " + " + (n*10+n) + " + " + (n*100+n*10+n));
        
        input.close();
    }
}
