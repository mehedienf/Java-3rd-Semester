public class n66 {
    public static void main(String[] args) {
        int sum = 2, flag = 0, count = 1;
        for (int i = 3; count <= 100; i++) {
            flag = 0;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                sum += i;
                count++;
                // System.out.println(count);
            }
        }
        // System.out.println(sum);
    }
}
