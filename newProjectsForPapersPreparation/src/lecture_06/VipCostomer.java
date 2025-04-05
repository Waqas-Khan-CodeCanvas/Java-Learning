package lecture_06;

public class VipCostomer {

    private String name;
    private String age;
    private double balance;

    public VipCostomer(String name){
        this(name,"18");
    }
    public VipCostomer(String name,String age){
        this(name,age,0.0);
    }
    public VipCostomer(String name,String age, double balance){
        this.name=name;
        this.age=age;
        this.balance=balance;
    }
    public void displayInfo(){
        System.out.println("Name  : "+name);
        System.out.println("Age  : "+age);
        System.out.println("Balance  : "+balance);
    }

}
