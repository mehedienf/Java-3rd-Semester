public class pattern {
    public static void main(String[] args) {
        int n = 8; // n is the number of rows you want to print
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
/*
 * for (int i = 0; i < 5; i+=2) {
 * for (int k = 4; k > i; k-=2) {
 * System.out.print(" ");
 * }
 * for (int j = 0; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 */