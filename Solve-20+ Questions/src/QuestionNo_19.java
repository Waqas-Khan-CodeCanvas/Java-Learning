public class QuestionNo_19 {
    public static void main(String[] args) {
        int number = 123 ;
        int hundreds = number / 100;
        int tens = (number % 100) /10 ;
        int ones = number % 10;
        int sumOfDigits=hundreds+tens+ones;
        System.out.println("Given Number : "+number);
        System.out.println("Sum of digits of given Number : "+sumOfDigits);
    }
}
