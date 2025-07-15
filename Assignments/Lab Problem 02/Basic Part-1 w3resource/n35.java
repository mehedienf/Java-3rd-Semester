import java.util.Scanner;

public class n35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, leength;
        System.out.print("Input the number of sides on the polygon: ");
        n = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        leength = input.nextInt();
        System.out.println("The area is: " + (n*Math.pow(leength, 2))/(4*Math.tan(Math.PI/n)));
        input.close();
    }
}