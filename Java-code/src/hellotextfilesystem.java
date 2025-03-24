
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hellotextfilesystem {
    private static double balance;
    private static String storedUsername;
    private static String storedPassword;

    public static void main(String[] args) {
        balance = 1000.0; // Initial balance
        try {
            loadCredentials(); // Load credentials from the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);

        // User authentication
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (!authenticateUser (inputUsername, inputPassword)) {
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

    // Load credentials from the file
    private static void loadCredentials() throws IOException {
        try {
            File file = new File("auth.txt");

            Scanner fileScanner = new Scanner(file);
            if (fileScanner.hasNextLine()) {
                String[] credentials = fileScanner.nextLine().split(":");
                storedUsername = credentials[0];
                storedPassword = credentials[1];
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Credentials file not found. Please ensure it exists.");
            System.exit(1); // Exit if the file is not found
        }
//        File myfile=new File("auth.txt");
//        myfile.createNewFile();
    }

    // Function to authenticate user with parameters
    private static boolean authenticateUser (String username, String passwordInput) {
        return storedUsername.equals(username) && storedPassword.equals(passwordInput);
    }

    // Function to reset the password
    private static void resetPassword(Scanner scanner) {
        System.out.print("Enter new password: ");
        String newPassword = scanner.next();
        storedPassword = newPassword; // Update the password variable
        System.out.println("Password has been reset successfully.");
        updateCredentials(); // Update the credentials file
    }

    // Function to update the credentials in the file
    private static void updateCredentials() {
        try {
            FileWriter writer = new FileWriter("auth.txt");
            writer.write(storedUsername + ":" + storedPassword);
            writer.close();
            System.out.println("Credentials updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the credentials.");
        }
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