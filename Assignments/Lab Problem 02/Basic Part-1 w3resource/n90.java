import java.util.Map;

public class n90 {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();

        String path = env.get("PATH");
        String temp = env.get("TEMP");
        String username = env.get("USERNAME");

        System.out.println("PATH: " + path);
        System.out.println("TEMP: " + temp);
        System.out.println("USERNAME: " + username);
    }
}
