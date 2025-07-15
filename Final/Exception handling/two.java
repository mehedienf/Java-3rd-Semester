class myException extends Exception {
    myException(String message) {
        super(message);
    }

}
public class two {
    public static void main(String[] args) {
        try {
            int n = 1;
            // int x = n/0;
            if (n == 1) {
                throw new myException("This is custom exception");
            }
        } catch (myException e) {
            System.out.println(e);
        }
    }
}
