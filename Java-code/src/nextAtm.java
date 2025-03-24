import java.util.Scanner;

public class nextAtm {

    // Initial balance
    private static double balance = 1000.00;

    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Start the ATM simulation
        runATM();
    }

    // Method to run the ATM menu
    public static void runATM() {
        boolean exit = false;

        // Loop until the user chooses to exit
        while (!exit) {
            // Display the menu
            displayMenu();

            // Get the user's choice and handle the corresponding action
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Exiting the system. Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Method to display the ATM menu
    public static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Method to deposit money (overloaded for int and double amounts)
    public static void depositMoney() {
        System.out.print("Enter amount to deposit: ");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount > 0) {
                depositMoney(amount); // Call the double version
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
    }

    // Overloaded deposit method for int values
    public static void depositMoney(int amount) {
        balance += amount;
        System.out.printf("You have successfully deposited $%d. Your new balance is: $%.2f%n", amount, balance);
    }

    // Overloaded deposit method for double values
    public static void depositMoney(double amount) {
        balance += amount;
        System.out.printf("You have successfully deposited $%.2f. Your new balance is: $%.2f%n", amount, balance);
    }

    // Method to withdraw money
    public static void withdrawMoney() {
        System.out.print("Enter amount to withdraw: ");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount > 0 && amount <= balance) {
                withdrawMoney(amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance. You cannot withdraw more than your current balance.");
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
    }

    // Method to withdraw money
    public static void withdrawMoney(double amount) {
        balance -= amount;
        System.out.printf("You have successfully withdrawn $%.2f. Your new balance is: $%.2f%n", amount, balance);
    }
}

