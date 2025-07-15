import java.util.Scanner;;

public class n39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        String temp;

        for (int i = 123; i <= 432; i++) {
            temp = Integer.toString(i);
            if ((temp.charAt(0) == '1' || temp.charAt(0) == '2' || temp.charAt(0) == '3' || temp.charAt(0) == '4') && (temp.charAt(1) == '1' || temp.charAt(1) == '2' || temp.charAt(1) == '3' || temp.charAt(1) == '4') && (temp.charAt(2) == '1' || temp.charAt(2) == '2' || temp.charAt(2) == '3' || temp.charAt(2) == '4')) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number: " + count);
        input.close();
    }
}
