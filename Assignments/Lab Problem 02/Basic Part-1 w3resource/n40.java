import java.nio.charset.Charset;
import java.util.Map;

public class n40 {

  public static void main(String[] args) {

    Map<String, Charset> charsets = Charset.availableCharsets();

    System.out.println("List of available character sets:");

    for (String charsetName : charsets.keySet()) {
      System.out.println(charsetName);
    }
  }
}
