public class Execrise_13_methode_overloading_using_condional_logic {
    public static void main(String[] args) {
        int number = 5;
        double price = 200.0;
        calculateResult(number);
    }
    public static void calculateResult(int number) {
        int constant = 10;
        int sum = constant + number;
        int factorial=1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("For the given integer " + number + ": Sum with constant is :  " + sum
                + ",and its Factorial is  = " + factorial);
    }
    public static void calculateResult(double originalPrice) {
        double discount = 0.10;
        double totalAfterDiscount = originalPrice * discount;
        double discountedPrice = originalPrice - totalAfterDiscount;
        double tax = 0.05;
        double totalTax = discountedPrice * tax;
        System.out.println("For double " + originalPrice + ": Total cost after discount = " + discountedPrice
                + ", Total tax = " + totalTax);
    }
}
