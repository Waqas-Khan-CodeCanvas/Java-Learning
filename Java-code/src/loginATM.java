import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class loginATM {
    private static String storedName;
    private static String storedPassword;
    private static String storedCity;
    private static String storedContact;
    private static String storedEmail;
    private static int storedAge;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the main menu
            System.out.println("ATM Simulation Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Show Profile");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");

            // Input validation for menu choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    showProfile();
                    break;
                case 4:
                    System.out.println("Exiting the ATM Simulation. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println(); // Print a new line for better readability
        } while (choice != 4);

        scanner.close();
    }

    // Function to create an account
    private static void createAccount(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        System.out.print("Enter your contact number: ");
        String contact = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Write the user information to a text file
        try {
            FileWriter writer = new FileWriter("credentials.txt");
            writer.write(name + ":" + username + ":" + password + ":" + city + ":" + contact + ":" + email + ":" + age);
            writer.close();
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the account.");
        }
    }

    // Function to login
    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Read the credentials from the file
        try {
            File file = new File("credentials.txt");
            Scanner fileScanner = new Scanner(file);
            if (fileScanner.hasNextLine()) {
                String[] credentials = fileScanner.nextLine().split(":");
                storedName = credentials[0];
                storedPassword = credentials[2]; // Password is the third element
                storedCity = credentials[3];
                storedContact = credentials[4];
                storedEmail = credentials[5];
                storedAge = Integer.parseInt(credentials[6]); // Age is the seventh element

                // Authenticate user
                if (inputUsername.equals(credentials[1]) && storedPassword.equals(inputPassword)) {
                    System.out.println("Login successful! Welcome to the ATM.");
                } else {
                    System.out.println("Authentication failed. Please check your username and password.");
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the credentials.");
        }
    }

    // Function to show the user's profile
    private static void showProfile() {
        try {
            File file = new File("credentials.txt");
            Scanner fileScanner = new Scanner(file);
            if (fileScanner.hasNextLine()) {
                String[] credentials = fileScanner.nextLine().split(":");
                System.out.println("User  Profile:");
                System.out.println("Name: " + credentials[0]);
                System.out.println("Username: " + credentials[1]);
                System.out.println("Password: " + credentials[2]);
                System.out.println("city: " + credentials[3]);
                System.out.println("contact : " + credentials[4]);
                System.out.println("email : " + credentials[5]);
                System.out.println("age: " + credentials[6]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}