package inheritance_lectures_task;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    private static Item[] inventory = new Item[100];
    private static int itemCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("******************  Welcome to the Inventory Management System ******************");
            System.out.println("\t1. Add Item");
            System.out.println("\t2. Add Stock");
            System.out.println("\t3. Show Total Items");
            System.out.println("\t4. Exit");
            System.out.print("Please select an option (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    addStock(scanner);
                    break;
                case 3:
                    Item.displayTotalItems();
                    break;
                case 4:
                    System.out.println("Exiting the Inventory Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println("*************************************************************");
        } while (choice != 4);
        scanner.close();
    }

    private static void addItem(Scanner scanner) {
        System.out.println("\tSelect Item Type:");
        System.out.println("\t1. Electronics");
        System.out.println("\t2. Groceries");
        System.out.print("Please enter your choice (1-2): ");
        int itemType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Item ID: ");
        String itemID = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        Item newItem = null;

        if (itemType == 1) {
            System.out.print("Enter Warranty Period: ");
            String warrantyPeriod = scanner.next();
            newItem = new Electronics(itemID, itemName, quantity, warrantyPeriod);
        } else if (itemType == 2) {
            System.out.print("Enter Expiration Date (YYYY-MM-DD): ");
            String dateInput = scanner.next();
            LocalDate expirationDate = LocalDate.parse(dateInput);
            newItem = new Groceries(itemID, itemName, quantity, expirationDate);
        }

        if (newItem != null && itemCount < inventory.length) {
            inventory[itemCount] = newItem;
            itemCount++;
            System.out.println("Item added successfully! Total items in inventory: " + itemCount);
        } else {
            System.out.println("Inventory is full. Cannot add more items.");
        }
    }

    private static void addStock(Scanner scanner) {
        System.out.print("Enter Item ID to add stock: ");
        String itemID = scanner.nextLine();
        System.out.print("Enter Quantity to add: ");
        int quantityToAdd = scanner.nextInt();

        boolean itemFound = false;

        for (int i = 0; i < itemCount; i++) {
            if (inventory[i].getItemID().equals(itemID)) {
                inventory[i].addStock(quantityToAdd);
                System.out.println("Stock added successfully! New quantity of " + inventory[i].getItemID() + ": " + inventory[i].getQuantity());
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Item ID not found.");
        }
    }
}