package inheritance_lectures_task;

public class Item {
    private String itemID;
    private String itemName;
    private int quantity;
    private static int totalItems = 0;

    public Item(String itemID, String itemName, int quantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems++;
    }
    public String getItemName(){
        return itemName;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public static void displayTotalItems() {
        System.out.println("Total items in inventory: " + totalItems);
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemID + ", Name: " + itemName + ", Quantity: " + quantity);
    }

    public String getItemID() {
        return itemID;
    }
}
