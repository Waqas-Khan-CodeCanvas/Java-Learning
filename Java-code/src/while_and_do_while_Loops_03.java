import java.util.Scanner;

public class while_and_do_while_Loops_03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int userNumber=scanner.nextInt();
        int sumOfDigits=0;

        while (userNumber>0){
            System.out.println("hello world");
            sumOfDigits+=userNumber%10; // gives the last digit
            userNumber/=10; // remove last digit
        }
        System.out.println("sum of the digits of the given number is :"+sumOfDigits);
    }
}
