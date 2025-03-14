//classes and objects Pen / book / student
//by default constructor /non parametrize constructor / parametrize constructor / copy constructor
// object reprence variables vs objects
//distructor /garbage collector / garbage detector
//constructor overloading
//abstraction
//encapsulation
//inheratance
//polymorphism
//types of polymorphism overloading and overiding function
//i.e constructor overloading constructor chaining


class Pen {
    String color;
    String type;

    public void writing(){
        System.out.println("writing something....");
    }
}
class Book{
    String title;
    String field;

    public void bookInfo(){
        System.out.println("title of the book is : "+title);
        System.out.println("This book is related to  : "+field);
    }

}
class Student{
    String name;
    String department;

    public void info(){
        System.out.println("Student name is : "+name);
        System.out.println("Student Department is :"+department);
    }

    public Student(){
        System.out.println("Constructor..... ");
    }
}
//copyConstructor
class Employee{
    String name;
    String department;

    public Employee(){}

    public Employee(Employee emp_01){
        name=emp_01.name;
        department=emp_01.department;
    }


}

public class Main {
    public static void main(String[] args) {

        Pen pen_01=new Pen();
        pen_01.color="black";
        pen_01.type="ballpoint";

        System.out.println(pen_01.color);
        System.out.println(pen_01.type);
        pen_01.writing();
        System.out.println();

        Pen pen_02=new Pen();
        pen_02.color="red";
        pen_02.type="gelPen";
        System.out.println(pen_02.color);
        System.out.println(pen_02.type);
        pen_02.writing();

        Book book_01 =new Book();
        book_01.title="Algorithms";
        book_01.field="Computer Secience\n";
        book_01.bookInfo();

        Book book_02=new Book();
        book_02.title="Play with Graphs";
        book_02.field="Statistical Analysis\n";
        book_02.bookInfo();

        Student student_01=new Student();
        student_01.name="ali";
        student_01.department="Computer Science";
        student_01.info();

        Employee emp_01=new Employee();

        emp_01.name="ali";
        emp_01.department="finance Department";
        System.out.println(emp_01.name);
        System.out.println(emp_01.department);
        System.out.println();

        Employee emp_02=new Employee(emp_01);
        System.out.println(emp_02.name);
        System.out.println(emp_02.department);
        System.out.println();

        //refrence objects
        Employee emp_03=emp_01;
        System.out.println(emp_03.name);
        System.out.println(emp_03.department);

        Teacher teacher_01=new Teacher();
        teacher_01.teacherInfo("ali",23);

    }
}