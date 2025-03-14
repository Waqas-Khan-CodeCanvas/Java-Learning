public class Teacher {
    String name;
    int age;

    public void  teacherInfo(String name){
        System.out.println("Teacher name is : "+name);
    }
    public void teacherInfo(int age){
        System.out.println("Teacher age is : "+age);
    }
    public void teacherInfo(String name,int age){
        System.out.println("Teacher name is : "+name);
        System.out.println("Teacher age is : "+age);
    }
}
