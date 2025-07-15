import java.util.Scanner;

public class n38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nc = 0, lc = 0, sc = 0, oc = 0, flag = 0;
        String x, number = "1234567890", letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("Input a string: ");
        x = input.nextLine();

        for (int i = 0; i < x.length(); i++) {
            flag = 0;
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == x.charAt(i)) {
                    nc++;
                    flag = 1;
                    break;
                }
            }
            for (int j = 0; j < letter.length(); j++) {
                if (letter.charAt(j) == x.charAt(i)) {
                    lc++;
                    flag = 1;
                    break;
                }
            }
            if (x.charAt(i) == ' ') {
                sc++;
                flag = 1;
            }
            else if (flag == 0) {
                oc++;
            }
        }
        System.out.println("Number: " + nc);
        System.out.println("Letter: " + lc);
        System.out.println("Space: " + sc);
        System.out.println("Other: " + oc);

        input.close();
    }
}
