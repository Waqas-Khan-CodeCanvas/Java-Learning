public class Execrise_12_methode_overloading_for_input_type {
    public static void main(String[] args) {
        printValue(30); //call the quantity method
        printValue(36.968f); //this will call the price method
        printValue(65723.750732532); //this statment will call the balance method
    }

    public static void printValue(int quantity) {
        System.out.println("Quantity: " + quantity);
    }

    public static void printValue(float price) {
        System.out.println("Product Price: " + price);
    }

    public static void printValue(double balance) {
        System.out.println("Account Balance: " + balance);
    }

}
