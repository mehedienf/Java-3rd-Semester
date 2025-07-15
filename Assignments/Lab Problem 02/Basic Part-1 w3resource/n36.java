import java.util.Scanner;

public class n36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2;
        double R = 6371.01;
        System.out.print("Input the latitude of coordinate x1: ");
        x1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate y1: ");
        y1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate x2: ");
        x2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate y2: ");
        y2 = input.nextDouble();

        double d = R * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        // double a = Math.sin(x2 - x1) + Math.cos(x1) * Math.cos(x2) * Math.sin(y2 - y1);
        // double c = 2 * Math.atan2( Math.sqrt(a), Math.sqrt(1-a));
        // double d = R * c;
        System.out.println(d);

        // input.close();
    }
}

/*
 * Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
 */