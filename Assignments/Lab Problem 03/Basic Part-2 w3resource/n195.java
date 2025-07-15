import java.util.Scanner;

public class n195 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side1, side2, side3;
        System.out.print("Enter the length of side 1: ");
        side1 = input.nextInt();
        System.out.print("Enter the length of side 2: ");
        side2 = input.nextInt();
        System.out.print("Enter the length of side 3: ");
        side3 = input.nextInt();

        System.out.println("Is the said sides form a triangle: " + ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)));
        input.close();
    }
}
