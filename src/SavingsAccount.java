public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accNumber, String accName, double rate) {
        super(accNumber, accName);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
