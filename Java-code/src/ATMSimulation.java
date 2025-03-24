import java.util.Scanner;

public class ATMSimulation {
    private double balance;

    // Constructor to initialize the balance
    public ATMSimulation() {
        this.balance = 1000.0; // Initial balance
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    // Method to deposit money (overloaded)
    public void depositMoney(int amount) {
        balance += amount;
        System.out.printf("You have deposited: $%d%n", amount);
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.printf("You have deposited: $%.2f%n", amount);
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn: $%.2f%n", amount);
        }
    }

    // Main method to run the ATM simulation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMSimulation atm = new ATMSimulation();
        int choice;

        do {
            // Display menu options
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            // Input validation for menu choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            atm.depositMoney(depositAmount);
                        } else {
                            System.out.println("Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    if (scanner.hasNextDouble()) {
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > 0) {
                            atm.withdrawMoney(withdrawAmount);
                        } else {
                            System.out.println("Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            System.out.println(); // Print a new line for better readability
        } while (choice != 4);

        scanner.close();
    }
}