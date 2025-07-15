public class one {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[5] = 30/5;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
        } finally {
            System.out.println("Rest of the code.");
        }
    }
}