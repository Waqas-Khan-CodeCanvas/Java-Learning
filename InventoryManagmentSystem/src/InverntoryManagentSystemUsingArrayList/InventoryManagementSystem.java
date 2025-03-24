package InverntoryManagentSystemUsingArrayList;

import java.util.ArrayList;

public class InventoryManagementSystem {
    private ArrayList<Item> inventory;

    public InventoryManagementSystem() {
        inventory = new ArrayList<>();
    }

    public void addItem(String name, int quantity, double price) {
        Item newItem = new Item(name, quantity, price);
        inventory.add(newItem);
        System.out.println("Item added successfully.");
    }

    public void updateItemQuantity(String name, int newQuantity) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(newQuantity);
                System.out.println("Item quantity updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void removeItem(String name) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                inventory.remove(item);
                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void searchItem(String name) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Item item : inventory) {
            totalValue += item.getQuantity() * item.getPrice();
        }
        return totalValue;
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }
}