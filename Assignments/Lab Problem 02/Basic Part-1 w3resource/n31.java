public class n31 {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        if (javaVersion != null) {
          System.out.println("Java is installed. Version: " + javaVersion);
        }
        else {
          System.out.println("Java version could not be detected.");
        }
      }
}
