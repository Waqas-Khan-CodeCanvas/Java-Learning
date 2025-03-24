import java.util.Scanner;
public class ATM_simulation {
    public static void main(String[] args) {
        double balance=1000.0;
        Scanner scanner=new Scanner(System.in);
        int userOption=0;
        while(userOption!=4){
            displayMenu();
            if (scanner.hasNextInt()) {
                userOption=scanner.nextInt();
                switch (userOption){
                    case 1:
                        checkBlance(balance);
                        break;
                    case 2:
                        System.out.print("please enter your amount to deposit:");
                        double depositMoney=scanner.nextInt();
                        balance=depostiMoney(depositMoney,balance);
                        break;
                    case 3:
                        System.out.print("please enter your amount to withdraw:");
                        double withdrawAmount=scanner.nextInt();
                        balance=withdrawMoney(withdrawAmount,balance);
                        break;
                    case 4:
                        System.out.print("Exiting... Thank your for using ATM");
                        break;
                    default:
                        System.out.println("Invalid please provide from the given options (1-4)");
                }
            }
            else {
                System.out.println("Invalid option please provide integer value");
                scanner.next();
            }
        }
    }
    public static void displayMenu(){
        System.out.println("\nATM Menu is displayed:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
    }
    public static void checkBlance(double balance){
        System.out.println("Your current balance is: $"+balance);
    }
    public static double depostiMoney(double depositAmount,double balance){
        double totalAmount=0;
        if (depositAmount<0){
            System.out.println("Your deposit Amount is not valid");
            totalAmount=balance;
        }else{
            totalAmount+=depositAmount+balance;
            System.out.println("You have deposited: "+depositAmount);
            System.out.println("You have $"+totalAmount+" amount in your ATM account");
        }
        return totalAmount;

    }
    public static double withdrawMoney(double withdrawAmount, double balance){
        double totalAmount=0;
        if (withdrawAmount>balance){
            System.out.println("Error : insufficient balance");
            totalAmount=balance;
        }else{
            totalAmount+=balance - withdrawAmount;
            System.out.println("You have withdraw : "+withdrawAmount+" Amount");
            System.out.println("You have $"+totalAmount+" amount in your ATM account");
        }
        return totalAmount;
    }
}
