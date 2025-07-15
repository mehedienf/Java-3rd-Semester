import java.util.Scanner;

public class n181 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        String str;
        System.out.print("Input a string: ");
        str = input.nextLine();

        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println("Length of the last word of the above string: " + count);
        input.close();
    }
}
