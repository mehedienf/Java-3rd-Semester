import java.util.Scanner;

public class n19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int decimal;
    System.out.print("input a decimal number: ");
    decimal = input.nextInt();
    System.out.println("Binary of "+ decimal+" is : " + Integer.toBinaryString(decimal));
    input.close();
  }
}
