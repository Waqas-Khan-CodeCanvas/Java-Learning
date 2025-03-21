package Array;

import java.util.Scanner;

public class ArrayUsingFuction {
    public static void main(String[] args) {

        int arrayLength=sizeOfArray();
        int[] intArray =new int[arrayLength];
        intArray= userInputInarray(intArray);

        printArray(intArray);
    }

    public static int sizeOfArray(){
        System.out.println("Enter range of your array here : ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        return  size;
    }

    public static int[] userInputInarray(int[] array){
        int[] intArray=array;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter the  items of your array");
            int arrayElement=scanner.nextInt();
            intArray[i]=arrayElement;
        }
        return intArray;
    }

    public static void printArray(int[] array){
        int[] intArray=array;
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
    }
}
