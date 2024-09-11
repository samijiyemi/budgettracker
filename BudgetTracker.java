import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        System.out.println("Budget Once, Spend Wisely!!!");
        // create an instance of scanner for accepting input from the user in the
        // terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How much is your budget?");
        double budgetPrice = scanner.nextDouble();

        System.out.println("How much do you have?");
        double balance = scanner.nextDouble();

        double walletBalanceAfterBudget = balance - budgetPrice;

        System.out.println("How much do you budget for education?");
        double educationBills = scanner.nextDouble();

        System.out.println("How much do you budget for Miscellanous?");
        double miscBills = scanner.nextDouble();
        double totalBalancRemaining = budgetPrice - educationBills - miscBills;

        System.out.println("Hey, " + (name) + " you have $" + (budgetPrice) + " to spend");
        System.out.print("\nAfter Education Bills you have $" + (budgetPrice - educationBills) + " left\n");
        System.out.println("\nRemaining balance after misc have been debited: $" + (totalBalancRemaining));
        System.out.println("Wallet Balance: $" + (walletBalanceAfterBudget + totalBalancRemaining));
    }
}
