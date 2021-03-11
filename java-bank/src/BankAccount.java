/**
 * BankAccount class This class simulates a bank account
 */

public class BankAccount {
    private double balance; // Account balance
    private double interestRate; // Interest Rate
    private double interest; // Interest earned

    /**
     * This constructor initializes the balance and interestRate fields with the
     * values passed to startBalance and intRate. The interest field is assigned
     * 0.0.
     */

    public BankAccount(double startBalance, double intRate) {
        balance = startBalance;
        interestRate = intRate;
        interest = 0.0;
    }

    /**
     * The deposit method adds the parameter amount to the balance field
     */

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addInterest() {
        interest = balance * interestRate;
        balance += interest;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }
}