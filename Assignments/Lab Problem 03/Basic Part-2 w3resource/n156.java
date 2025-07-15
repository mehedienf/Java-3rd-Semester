public class n156 {
    public static int largestIntegerLessThanLog2(int n) {
        if (n <= 0) {
            return -1; // Handle invalid input
        }

        int log2 = (int) (Math.log(n) / Math.log(2));
        return log2;
    }

    public static void main(String[] args) {
        // int n = 2330;
        int result = largestIntegerLessThanLog2(n);
        System.out.println("Largest integer less than log2(" + n + ") is: " + result);
    }
}
