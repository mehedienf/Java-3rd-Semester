import java.util.Scanner;

public class n87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, sum = 0, temp;

        System.out.print("Input the number: ");
        a = input.nextInt();
        for (int i = a; i > 0; ) {
            temp = i % 10;
            sum += temp;
            i -= temp;
            i /= 10;
        }
        System.out.println("Sum = " + sum);
        System.out.print("In word: ");
        
        for (int i = 0; i < Integer.toString(sum).length(); i++) {
            switch (Integer.toString(sum).charAt(i)) {
            case '0':
                System.out.print("Zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
            default:
                break;
            }
        }
        System.out.println();
        input.close();
    }
}
