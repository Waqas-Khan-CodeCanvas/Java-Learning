package inheritance_in_java_oops;

public class Shape {
    String color;

    public void printColor(){
        System.out.println("Color is : "+color);
    }
    public void area(){
        System.out.println("shaper area....");
    }
}
class Tringle extends Shape{
    public void area(int lenght, int width){
        int area=1/2*lenght*width;
        System.out.println("Area of tringle is : "+area);
    }
}
class Circle extends Shape{
    public void area(int radius){
        double area=(2*1.431*radius*radius);
        System.out.println("Area of the circle is : "+area);
    }
}
class Square extends Shape{
    public void area(int lenght,int width){
        int area=lenght*width;
        System.out.println("Area of the Squre is : "+area);
    }
}