import java.util.ArrayList;

class Address{
    private int houseNo;

    public Address(int houseNo) {
        this.houseNo = houseNo;
    }
    public int getHouseNo() {
        return houseNo;
    }
}
class User{

    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
          Address address=new Address(10);
          User user=new User(address);

        System.out.println(user.getAddress().getHouseNo());

        ArrayList<String> names=new ArrayList<>();

    }
}