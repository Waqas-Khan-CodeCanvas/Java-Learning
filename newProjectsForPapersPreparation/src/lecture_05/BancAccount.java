package lecture_05;
class BankAccount{
    private String accountName;
    private String accountNumber;
    private String email;
    private String phoneNumber;
    private double balance;

    public  BankAccount(String accountName,String accountNumber,String email,String phoneNumber,double balance){
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.balance=balance;
    }

    public double getBlance(){
        return balance;
    }

    public void depositMoney(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Money has been deposited successfully to your account");
            System.out.println("deposited amount : "+amount+" New balance is : "+balance);
        }
    }

    public void withdrawMoney(double amount){
        if (amount <= balance && amount >0 ) {
                balance=balance-amount;
            System.out.println("Money has been withdraw successfully from your account");
            System.out.println("withdraw amount : "+amount+" current balance is : "+balance);
        }
    }

    public void showAccountInfo(){
        System.out.println("Your account Information is here.");
        System.out.println("Account Name : "+accountName);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Email : "+email);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Current Balance : "+balance);
    }
}
























//class BankAccount {
//    private String accountNumber;
//    private String customerName;
//    private double balance;
//    private String email;
//    private String phoneNumber;
//    // Constructor
//    public BankAccount(String accountNumber, String customerName, double
//            balance, String email, String phoneNumber) {
//        this.accountNumber = accountNumber;
//        this.customerName = customerName;
//        this.balance = balance;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
//    // Deposit method
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited: " + amount + " New balance: " +
//                balance);
//    }
//    // Withdraw method
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrew: " + amount + " New balance: " +
//                    balance);
//        } else {
//            System.out.println("Insufficient funds.");
//        }
//    }
//    // Getter for balance
//    public double getBalance() {
//        return balance;
//    }
//}

