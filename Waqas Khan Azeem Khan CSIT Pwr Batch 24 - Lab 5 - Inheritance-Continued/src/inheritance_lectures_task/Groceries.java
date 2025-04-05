package inheritance_lectures_task;

import java.time.LocalDate;

public class Groceries extends Item {
    private LocalDate expirationDate;

    public Groceries(String itemID, String itemName, int quantity, LocalDate expirationDate) {
        super(itemID, itemName, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void addStock(int quantity) {
        if (LocalDate.now().isBefore(expirationDate)) {
            super.addStock(quantity);
            System.out.println("Stock added for " + getItemName() + ". It is not expired.");
        } else {
            System.out.println("Cannot add stock. " + getItemName() + " is expired.");
        }
    }
}