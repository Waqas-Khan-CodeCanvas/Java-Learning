import java.util.Scanner;

public class useOfScannerClass_04 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you name here : ");
        String userName=scanner.nextLine();
        System.out.println(userName);
        System.out.println("Enter you year of birth here : ");
        if (scanner.hasNextInt()) {
            int userAge=scanner.nextInt();
            System.out.println("Hello "+userName+" you are "+(2024-userAge+" years old"));
        }else{
            System.out.println("Invalid age provided");
        }
    }
}
