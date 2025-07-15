import java.util.Scanner;

public class n42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pass;
        System.out.print("Input your password: ");
        pass = input.nextLine();

        System.out.println("Password is: " + pass);
        
        input.close();
    }
}
