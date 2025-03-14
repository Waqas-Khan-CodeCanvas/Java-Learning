package lectures_06;

public class BankAccount {



    private String accountName;
    private  long accountNumber;
    private  long phoneNumber;
    private  double accountBalance;

    public BankAccount(String[] name){

        for (int i = 0; i <= name.length-1; i++) {
            System.out.println(name[i]);
        }

    }

    public BankAccount(String accountName){
        this(100,accountName);

    }
    public BankAccount(int accountNumber, String accountName){
        this(100,accountName,123456);

    }
    public BankAccount(int accountNumber, String accountName,int phoneNumber){
        this(100,accountName,123456,0.0);

    }
    public BankAccount(int accountNumber, String accountName,int phoneNumber ,double accountBalance){
        this.accountName=accountName;

    }
    public String getAccountName() {
        return accountName;
    }

}

