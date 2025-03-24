public class Exercise_06_Function_with_conditional_logic {
    public static void main(String[] args) {
        int number = 23;
        String result=checkNumber(number);
        System.out.println(result);

    }
    public static String checkNumber(int number){
        String result;
        if (number%2==0) {
            result="The given number "+number+" is Even ";
        }else{
            result="The given number "+number+" is Odd ";
        }
        return result;
    }
}
