import java.util.Scanner;

public class passwordRest {
    private static double balance;
    private static String password; // Variable to hold the password

    public static void main(String[] args) {
        balance = 1000.0; // Initial balance
        password = "pass"; // Set a predefined password
        Scanner scanner = new Scanner(System.in);

        // Define username inside the main method
        String USERNAME = "user"; // Set a predefined username

        // User authentication
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (!authenticateUser (inputUsername, inputPassword, USERNAME, password)) {
            System.out.println("Authentication failed. Exiting the ATM.");
            return; // Exit if authentication fails
        }

        int choice;
        do {
            // Display menu options
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Reset Password");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");

            // Input validation for menu choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            depositMoney(depositAmount);
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
                            withdrawMoney(withdrawAmount);
                        } else {
                            System.out.println("Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                case 4:
                    resetPassword(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            System.out.println(); // Print a new line for better readability
        } while (choice != 5);

        scanner.close();
    }

    // Function to authenticate user with parameters
    private static boolean authenticateUser (String username, String passwordInput, String predefinedUsername, String predefinedPassword) {
        return predefinedUsername.equals(username) && predefinedPassword.equals(passwordInput);
    }

    // Function to reset the password
    private static void resetPassword(Scanner scanner) {
        System.out.print("Enter new password: ");
        String newPassword = scanner.next();
        password = newPassword; // Update the password variable
        System.out.println("Password has been reset successfully.");
    }

    // Function to check the balance
    public static void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    // Function to deposit money
    public static void depositMoney(double amount) {
        balance += amount;
        System.out.printf("You have deposited: $%.2f%n", amount);
    }

    // Function to withdraw money
    public static void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn: $%.2f%n", amount);
        }
    }
}