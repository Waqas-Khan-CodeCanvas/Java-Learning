package lecture_05;
public class Main {
    public static void main(String[] args) {
        BankAccount hbl=new BankAccount(
                "HBL",
                "0000121314",
                "example@gmail.com",
                "034363040859",
                100000
        );
        hbl.showAccountInfo();
    }
}


//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("12345", "John Doe", 1000.0,
//                "john@example.com", "1234567890");
//        account.deposit(200);
//        account.withdraw(150);
//    }
//}

