public class Exercise_05_Simple_Function_for_multiplication {

    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 34;
        int result=multiplication(firstNumber,secondNumber );
        System.out.println("Result for multiplication of two numbers is : "+result);

    }
    public static int multiplication(int firstNumber, int secondNumber){
        int result=firstNumber*secondNumber;
        return result;
    }
}
