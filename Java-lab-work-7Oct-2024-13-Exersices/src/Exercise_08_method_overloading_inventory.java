public class Exercise_08_method_overloading_inventory {
    public static void main(String[] args) {
        calculateIinentory(50, 25.5);
        calculateIinentory(200, 20);
    }

    public static void calculateIinentory(int numberOfProducts, double unitPrice) {
        double totalValue = numberOfProducts * unitPrice;
        System.out.println("Total value of Product A (" +  numberOfProducts + " units at $ "+unitPrice+ " per unit): " + "$" + totalValue);
    }

    public static void calculateIinentory(int numberOfProducts, int unitPrice) {
        int totalValue = numberOfProducts * unitPrice;
        System.out.println("Total value of Product B (" +  numberOfProducts + " units at $  "+unitPrice+ " per unit): " + "$" + totalValue);
    }
}