import java.util.Scanner;

public class userAuthentication {
    private static double balance;

    public static void main(String[] args) {
        balance = 1000.0; // Initial balance
        Scanner scanner = new Scanner(System.in);

        // Define username and password inside the main method
        String USERNAME = "user"; // Set a predefined username
        String PASSWORD = "pass"; // Set a predefined password

        // User authentication
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
        if (!authenticateUser (inputUsername, inputPassword, USERNAME, PASSWORD)) {

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
                    System.out.println("Exiting the ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            System.out.println(); // Print a new line for better readability
        } while (choice != 4);

        scanner.close();
    }

    // Function to authenticate user with parameters
    private static boolean authenticateUser (String username, String password, String predefinedUsername, String predefinedPassword) {
        return predefinedUsername.equals(username) && predefinedPassword.equals(password);
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