package Bank;

public class BankApp {

    private String  accountName;
    private int accountNumber;
    private int accounBalance;
    private String accountEmail;
    private int accountPhoneNumber;

    public BankApp(String name,int accountNumber,int balance,String email,int phoneNumber){
        this.accountName=name;
        this.accountNumber = accountNumber;
        this.accounBalance = balance;
        this.accountEmail = email;
        this.accountPhoneNumber = phoneNumber;
    }

    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccounBalance() {
        return accounBalance;
    }
    public String  getAccountEmail() {
        return accountEmail;
    }
    public int getAccountPhoneNumber() {
        return accountPhoneNumber;
    }
}
