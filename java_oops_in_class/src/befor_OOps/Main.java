package befor_OOps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String age="ali";
//        int name=18;
//        int myMathsMarks=80;
//        System.out.println("what is your name  :"+age);
//        System.out.println("what is your name  :"+age);

//        int age=20;
//        String identity="pakistan";
//
//        if (age >= 18) {
//            if (identity == "pakistan") {
//                System.out.println("you can vote");
//            }else{
//                System.out.println("you can't vote");
//            }
//        }else{
//            System.out.println("you are under age please wait");
//        }

//        String str_number="100";
//        int int_number=Integer.parseInt(str_number);
//        int num2=1003;
//        System.out.println(num2+int_number);

//        String name="     Ali ";
//        name=name.toLowerCase();
//        name=name.toUpperCase();
//        name=name.trim();
//        String name2="ahmad";
//        System.out.println(name);
//        System.out.println(name+name2);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(i+" : hello world");
//            for (int j = 0; j < 3; j++) {
//                System.out.println(j);
//            }
//        }
//        Scanner scanner=new Scanner(System.in);
//        String userInput=scanner.nextLine();
//        boolean exit=false;
//        while (!exit){
//            System.out.println("do you want to exit (yes)");
//            userInput=scanner.nextLine();
//            if (userInput.equals("yes")){
//                exit=true;
//            }
//        }
//        String[] names={"ali","waqas","zaryab","ilsa","noor"};
//        myInfo(names);
//    public static void myInfo(String[] arg){
//        for (int i = 0; i < arg.length; i++) {
//            System.out.println("my name is : "+arg[i]);
//
//        }
      String name=myInfo();
        System.out.println(name);
//    }
    }

    public static String myInfo(){
        String name="ali";
        return name;
    }
}
