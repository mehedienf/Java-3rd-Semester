import java.util.Scanner;

public class n189 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1Sum = 0, s2Sum = 0;
        String s1, s2, s3 = "0123456789";
        System.out.print("Input a integer as first string: ");
        s1 = input.nextLine();
        System.out.print("Input a integer as second string: ");
        s2 = input.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s3.length(); j++) {
                if (s1.charAt(i) == s3.charAt(j)) {
                    s1Sum *= 10;
                    s1Sum += j;
                    break;
                }
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s3.length(); j++) {
                if (s2.charAt(i) == s3.charAt(j)) {
                    s2Sum *= 10;
                    s2Sum += j;
                    break;
                }
            }
        }
        System.out.printf("Sum of %s and %s = %d\n", s1, s2, (s1Sum+s2Sum));
        // System.err.println(s1Sum);
        // System.err.println(s2Sum);
        input.close();
    }
}
