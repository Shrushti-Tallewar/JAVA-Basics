package project;
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class SBI implements Bank {
    double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Interface  {
    public static void main(String[] args) {
        SBI account = new SBI();

        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}

