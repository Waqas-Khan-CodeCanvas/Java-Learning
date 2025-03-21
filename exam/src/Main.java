import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>  numbers=new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            int square=i*i;
            numbers.add(square);
        }
        
        System.out.println(numbers);

    }

}