import java.util.Scanner;

public class n163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, count = 0;
        System.out.print("Input an integer: ");
        a = input.nextInt();
        System.out.println("Binary representation of " + a + " is: " + Integer.toBinaryString(a));
        for (int i = 0; i < Integer.toBinaryString(a).length(); i++) {
            if (Integer.toBinaryString(a).charAt(i) == '0') {
                count++;
            }
        }
        System.out.println("Number of zero bits: " + count);
        
        input.close();
    }
}
