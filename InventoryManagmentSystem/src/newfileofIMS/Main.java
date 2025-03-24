package newfileofIMS;

import InverntoryManagentSystemUsingArrayList.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> inventory=new ArrayList<>();
        String name="nothing";
        int quantity=12;
        int price=1000;

        Item obj=new Item(name,quantity,price);
        inventory.add(obj);

    }
}
