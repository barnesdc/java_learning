import java.util.Scanner;
import java.text.DecimalFormat;

public class HalsCommission {
    public static void main(String[] args) {
        double sales, advancePay;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        DecimalFormat percent = new DecimalFormat("#0%");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will display a pay report for a salesperson.");
        System.out.println("Enter the following information:");

        // ask for sales and advanced pay
        System.out.print("Ammount of sales: $");
        sales = keyboard.nextDouble();

        System.out.print("Amount of advanced pay: $");
        advancePay = keyboard.nextDouble();

        SalesCommission payInfo = new SalesCommission(sales, advancePay);

        // Display the pay report for the sales person.
        System.out.println("\nPay Report");
        System.out.println("-------------------------");
        System.out.println("Sales: $" + dollar.format(payInfo.getSales()));
        System.out.println("Commision Rate: " + percent.format(payInfo.getRate()));
        System.out.println("Commission: $" + dollar.format(payInfo.getCommision()));
        System.out.println("Advanced Pay: $" + dollar.format(payInfo.getAdvance()));
        System.out.println("Remaining Pay: $" + dollar.format(payInfo.getPay()));
        keyboard.close();
    }
}
