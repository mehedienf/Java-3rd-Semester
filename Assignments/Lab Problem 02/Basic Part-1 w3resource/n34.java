import java.util.Scanner;

public class n34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s;
        System.out.print("Input the length of a side of the hexagon: ");
        s = input.nextInt();
        System.out.println("The area of the hexagon is: " + 6 * Math.pow(s, 2)/(4*Math.tan(Math.PI/6)));
        input.close();
    }
}