import java.util.Scanner;

class BankAccount {
    void deposit() {

    }
    void withdraw() {
        System.out.println("You can withdraw");
    }
}
class SavingsAccount extends BankAccount {
    void withdraw() {
        System.out.println("balance is less than 100. You can't withdraw!");
    }
}

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        SavingsAccount savingsAccount = new SavingsAccount();
        int ac;
        System.out.print("Input amount: ");
        ac = input.nextInt();
        if (ac < 100) {
            savingsAccount.withdraw();
        }
        else {
            bankAccount.withdraw();
        }
        input.close();
    }
}
