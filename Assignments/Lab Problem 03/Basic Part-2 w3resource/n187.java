import java.util.Scanner;

public class n187 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int flag = 0;
        String s;
        System.out.print("Input a string: ");
        s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((i != j) && (s.charAt(i) == s.charAt(j))) {
                    flag = 1;
                    break;
                }
                else {
                    flag = 0;
                }
            }
            if (flag == 0) {
                System.out.println("Index of first non-repeating character in '" + s + "' is: " + i);
                break;
            }
        }
        input.close();
    }
}
