package Array;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter range of your array here : ");
        Scanner scanner=new Scanner(System.in);
        int arrayLength=scanner.nextInt();
        int[] number=new int[arrayLength];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the  items of your array");
            int arrayElement=scanner.nextInt();
            number[i]=arrayElement;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }



    }
}
