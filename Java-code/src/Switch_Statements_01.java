import java.util.Scanner;

public class Switch_Statements_01 {
    public static void main(String[] args) {

        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter (1-7) for any day of the week " );
        int dayOfTheWeek=userInput.nextInt();

        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
                System.out.println("Sunday ");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
