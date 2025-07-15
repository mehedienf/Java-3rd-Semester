import java.util.Scanner;

public class n186 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int flag = 0, l;
        String s;
        System.out.print("Input a number: ");
        s = input.nextLine();
        l = s.length();

        if (l > 1) {
            for (int i = 0, j = l-1; i < (l/2); i++, j--) {
                if ((s.charAt(i) == '1' && s.charAt(j) == '1') || ((s.charAt(i) == '6') && (s.charAt(j) == '9')) || ((s.charAt(i) == '9') && (s.charAt(j) == '6')) || ((s.charAt(i) == '8') && (s.charAt(j) == '8')) || ((s.charAt(i) == '0') && (s.charAt(j) == '0'))) {
                    if (l%2 != 0) {
                        if ((s.charAt(l/2) == '1') || (s.charAt(l/2) == '0') || (s.charAt(l/2) == '8')) {
                            flag = 0;
                        }
                        else {
                            flag = 1;
                            break;
                        }
                    }
                    else {
                        flag = 0;
                    }
                }
                else {
                    flag = 1;
                    break;
                }
            }
        }
        else {
            if ((s.charAt(0) == '1') || (s.charAt(0) == '0') || (s.charAt(0) == '8')) {
                flag = 0;
            }
            else {
                flag = 1;
            }
        }
        System.out.println("Is " + s + " is Strobogrammatic? " + (flag == 0));
        input.close();
    }
}
