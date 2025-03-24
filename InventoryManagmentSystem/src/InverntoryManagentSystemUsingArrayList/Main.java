package InventoryManagementSystemUsingArrayList;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       InventoryManagementSystem ims = new InventoryManagementSystem();
       int choice;

       do {
           System.out.println("1. Add Item");
           System.out.println("2. Update Item Quantity");
           System.out.println("3. Remove Item");
           System.out.println("4. Search Item");
           System.out.println("5. Display Inventory Value");
           System.out.println("6. Exit");
           System.out.print("Enter your choice: ");
           choice = scanner.nextInt();
           scanner.nextLine(); // consume the newline

           switch (choice) {
               case 1:
                   System.out.print("Enter item name: ");
                   String name = scanner.nextLine();
                   System.out.print("Enter item quantity: ");
                   int quantity = scanner.nextInt();
                   System.out.print("Enter item price: ");
                   double price = scanner.nextDouble();
                   ims.addItem(name, quantity, price);
                   break;

               case 2:
                   System.out.print("Enter item name to update: ");
                   String updateName = scanner.nextLine();
                   System.out.print("Enter new quantity: ");
                   int newQuantity = scanner.nextInt();
                   ims.updateItemQuantity(updateName, newQuantity);
                   break;

               case 3:
                   System.out.print("Enter item name to remove: ");
                   String removeName = scanner.nextLine();
                   ims.removeItem(removeName);
                   break;

               case 4:
                   System.out.print("Enter item name to search: ");
                   String searchName = scanner.nextLine();
                   ims.searchItem(searchName);
                   break;

               case 5:
                   double totalValue = ims.calculateTotalValue();
                   System.out.printf("Total inventory value: $%.2f%n", totalValue);
                   break;
           }
       } while (choice != 6);
   }
}
