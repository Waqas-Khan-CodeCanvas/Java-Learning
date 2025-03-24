public class Exercise_07_Method_Overloading {
    public static void main(String[] args) {
        //this is code for method overloading that define the different type  of function

        int fistNumber = 345;
        int secondNumber = 123;

        double result=addition(fistNumber,secondNumber);
        System.out.println("The sum of all given number is :"+result);
    }

    public static int addition(int fistNumber){
        int result=fistNumber;
        return result;
    }

    public static double addition(int fistNumber,int secondNumber){
        double result=fistNumber+secondNumber;
        return result;
    }

    public static int addition(int fistNumber,int secondNumber,int thirdNumber){
        int result=fistNumber+secondNumber+thirdNumber;
        return result;
    }
}
