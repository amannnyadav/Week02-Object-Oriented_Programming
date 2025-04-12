public class BankAccount {
    private static String bankName = "SBI";
    private static int totalAccounts = 0;

    private final int accNo;
    private String name;

    public BankAccount(String name) {
        this.name = name;
        this.accNo = generateAccNo();
        totalAccounts++;
    }

    public static void getAccounts() {
        System.out.println("\nTotal number of accounts: " + totalAccounts);
    }

    public void display() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accNo);
        }
    }

    private int generateAccNo() {
        return (int) (Math.random() * 1000000);
    }

    public int getAccNo() {
        return accNo;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aman");
        BankAccount account2 = new BankAccount("Manoj");

        account1.display();
        System.out.println();
        account2.display();

        BankAccount.getAccounts();
    }
}