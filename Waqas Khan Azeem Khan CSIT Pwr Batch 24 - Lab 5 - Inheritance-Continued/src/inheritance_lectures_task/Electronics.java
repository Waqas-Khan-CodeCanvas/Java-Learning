package inheritance_lectures_task;

public class Electronics extends Item {
    private String warrantyPeriod;

    public Electronics(String itemID, String itemName, int quantity, String warrantyPeriod) {
        super(itemID, itemName, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void addStock(int quantity) {
        super.addStock(quantity);
        System.out.println("Stock added for " + getItemName() + " with warranty period: " + warrantyPeriod);
    }
}