package fiirstLecture_01;

public class Main {
    public static void main(String[] args) {
//        System.out.println("ali khan");
//        String name ="ali khan";
//
//        System.out.println(name);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE+10);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MIN_VALUE-1);
//        int age=20;
//        double newAge=age;
//        System.out.println(age);
//        System.out.println(newAge);
//
//        int answer=5/2;
//        float newAnswer=(float) 5/2;
//        System.out.println(answer);
//        System.out.println(newAnswer);


//        String greet="welcome";
//        String name="ali";
//        System.out.println(greet.concat(name));
////        System.out.println(greet+name);

//        int a=2;
//        int b=4;
//
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " +(a - b));
//        System.out.println("a * b = " + a * b);
//        System.out.println("a / b = " + a / b);
//        System.out.println("a ** a = " + ( a * a));

        String name="Mustafa";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0,5));
        System.out.println(name.contains("fa"));
        System.out.println(name.replace("u","o"));
        System.out.println(name.repeat(5) );

        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //if else condition in java

        int age=20;
        if(age >= 18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("sorry: you con't vote ");
        }

















    }

}
