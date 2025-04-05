public class Main {
    public static void main(String[] args) {
    String name ="ali";
    String dept="CS";
//    String[] names={"ali","waqas","awais","wazir","umair","ali","waqas","awais","wazir","umair","ali","waqas","awais","wazir","umair"};
//    printNames(names);
//        System.out.println( myInfo(name,dept));
        printMyInfo(20);
    }
    public static String myInfo(String name, String dept){
        String city="mardan";
        System.out.println("my name is : "+name);
        System.out.println("my dept name is : "+dept);
        return city;
    }
    public static void printNames(String[] names){
        for (int i = 0; i < names.length; i++) {
            System.out.println(i+" : "+names[i]);
        }
    }

    public static void printMyInfo(){
        System.out.println("my name is : ali");
        System.out.println("my age is : 20");
    }
    public static void printMyInfo(String name,int age){
        System.out.println("my name is : "+name);
        System.out.println("my age is : "+age);
    }

    public static void printMyInfo(String name){
        System.out.println("my name is : "+name);
    }
    public static void printMyInfo(int age){
        System.out.println("my age is : "+age);
    }
}