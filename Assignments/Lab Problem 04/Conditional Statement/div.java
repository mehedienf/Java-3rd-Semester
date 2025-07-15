public class div {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 32; i++) {
            if (64 % i == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}