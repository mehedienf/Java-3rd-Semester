import java.text.SimpleDateFormat;
import java.util.Date;

public class n47 {
    public static void main(String[] args) {

    String Pattern = "yyyy/MM/dd HH:mm:ss.SSS";

    SimpleDateFormat formatter = new SimpleDateFormat(Pattern);
    Date now = new Date();

    System.out.println("Now: " + formatter.format(now));
  }
}
