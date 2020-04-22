public class BankAccount {
    // BankAccount attributes
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accNumber, String accName) {
        accountNumber = accNumber;
        accountName = accName;
        balance = 0;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }
}
