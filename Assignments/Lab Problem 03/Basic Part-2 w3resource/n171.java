import java.util.Scanner;

public class n171 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        String str1, str2;
        System.out.print("Input first string: ");
        str1 = input.nextLine();
        System.out.print("Input second string: ");
        str2 = input.nextLine();

        for (int i = 0, j = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str1.charAt(j)) {
                count++;
                j++;
                if (count == str1.length()) {
                    break;
                }
            }
            else {
                count = 0;
                j = 0;
            }
        }
        System.out.println("Second string contains the first one: " + (count == str1.length()));
        input.close();
    }
}
