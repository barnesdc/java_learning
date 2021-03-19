import java.util.Scanner; // Needed for scanner class

/**
 * This program demonstrates the BankAccount class
 */

public class BankAccountTest {
    public static void main(String[] args) {
        // BankAccount account;
        BankAccount account;
        double balance, interestRate, pay, cashNeeded;

        // create Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your account's starting balance? ");

        balance = keyboard.nextDouble();

        System.out.print("What is your monthly interest rate? ");
        interestRate = keyboard.nextDouble();

        account = new BankAccount(balance, interestRate);

        System.out.print("How much were you paid this month? ");
        pay = keyboard.nextDouble();

        System.out.println("we will deposit your pay into your account.");
        System.out.println("Your current balance is $" + account.getBalance());

        System.out.print("How much would you like to withdraw? ");

        cashNeeded = keyboard.nextDouble();
        account.withdraw(cashNeeded);

        account.addInterest();

        System.out.println("This month you have earned $" + account.getInterest() + "in intereset.");
        System.out.println("Now your balance is $" + account.getBalance());
        keyboard.close();
    }
}
