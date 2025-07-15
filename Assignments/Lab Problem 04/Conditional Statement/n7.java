import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, month;
        boolean flag = false;
        System.out.print("Input Year: ");
        year = scanner.nextInt();
        System.out.print("Input Month in number: ");
        month = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            flag = true;
        }
        switch (month) {
            case 1:
                System.out.printf("January %d has 31 days\n", year);
                break;
        
            case 2:
                if (flag == true) {
                    System.out.printf("February %d has 29 days\n", year);
                }
                else {
                    System.out.printf("February %d has 28 days\n", year);
                }
                break;
            case 3:
                System.out.printf("March %d has 31 days\n", year);
                break;
            case 4:
                System.out.printf("April %d has 30 days\n", year);
                break;
            case 5:
                System.out.printf("May %d has 31 days\n", year);
                break;
            case 6:
                System.out.printf("June %d has 30 days\n", year);
                break;
            case 7:
                System.out.printf("July %d has 31 days\n", year);
                break;
            case 8:
                System.out.printf("August %d has 31 days\n", year);
                break;
            case 9:
                System.out.printf("September %d has 30 days\n", year);
                break;
            case 10:
                System.out.printf("October %d has 31 days\n", year);
                break;
            case 11:
                System.out.printf("November %d has 30 days\n", year);
                break;
            case 12:
                System.out.printf("December %d has 31 days\n", year);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        scanner.close();
    }
}

/*
 * January: 31 days
February: 28 days (29 in leap years)
March: 31 days
April: 30 days
May: 31 days
June: 30 days
July: 31 days
August: 31 days
September: 30 days   
October: 31 days
November: 30 days
December: 31 days
   
 */