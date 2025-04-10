class Bank{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public Bank(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
public class BankMain {
    public static void main(String[] args) {
        Bank account = new Bank("John Doe", 123456789, 1000.0);
       
        account.displayBalance();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
        account.displayBalance();
    }
}