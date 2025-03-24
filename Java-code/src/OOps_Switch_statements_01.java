import java.util.Scanner;

public class OOps_Switch_statements_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to present a day");
        int userInput=scanner.nextInt();
        String result=dayOfTheWeek(userInput);
        System.out.println("The day is :"+result);
    }
    public static String dayOfTheWeek(int day){
        String dayOfTheWeek="";
        switch (day){
            case 1:
                dayOfTheWeek="Monday";
                break;
            case 2:
                dayOfTheWeek="Tuesday";
                break;
            case 3:
                dayOfTheWeek="Wednesday";
                break;
            case 4:
                dayOfTheWeek="Thursday";
                break;
            case 5:
                dayOfTheWeek="Friday";
                break;
            case 6:
                dayOfTheWeek="Saturday";
                break;
            case 7:
                dayOfTheWeek="Sunday";
                break;
        }
    return dayOfTheWeek;
    }
}
