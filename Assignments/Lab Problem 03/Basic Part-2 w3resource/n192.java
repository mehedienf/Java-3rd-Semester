import java.util.Scanner;

public class n192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s, rs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
        System.out.print("Input a string: ");
        s = input.nextLine();
        // String[] s2 = new String[s.length()];
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < rs.length(); j++) {
                if (s.charAt(i) == rs.charAt(j)) {
                    arr[i] = j;
                }
            }
        }
        // char temp1;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // temp1 = s.charAt(j);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Rearrange string is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rs.charAt(arr[i]));
        }
        System.out.println();
        // System.out.println(arr[2]);
        input.close();
    }
}

// 36296