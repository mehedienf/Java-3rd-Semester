class BankAccount {
    protected double balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: $" + amount);
        }
        else {
            System.out.println("Insufficient funds!");
        }
    }
    double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        }
        else {
            System.out.println("Minimum balance of $100 must be maintained!");
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(500);
        savingsAccount.withdraw(500);
        savingsAccount.withdraw(300);
        System.out.println(savingsAccount.getBalance());
        
    }
}
