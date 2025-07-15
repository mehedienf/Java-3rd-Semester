import java.util.*;

public class n88 {

    public static void main(String[] args) {
        System.out.println("\nCurrent system environment:");
        Map<String, String> env = System.getenv();

        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\n\nCurrent system properties:");
        Properties props = System.getProperties();

        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
