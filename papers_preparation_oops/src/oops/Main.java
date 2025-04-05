package oops;

class Pen{


    private String name;
    private String color;
    private String shape;
    private String type;

    public Pen(String name){
        this(name,"black");
    }
    public Pen(String name, String color){
        this(name,color,"circle");
    }
    public  Pen(String name ,String color , String shape){
        this(name,color,shape,"gell");
    }
    public  Pen(String name, String color,String shape,String type){
        this.name=name;
        this.color=color;
        this.shape=shape;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public String getShape() {
        return shape;
    }


//    public Pen(String name,String color,String shape, String type){
//        this.name=name;
//        this.color=color;
//        this.shape=shape;
//        this.type=type;
//    }
//
//    public Pen(){
//        this.name="mypen";
//        this.color="black";
//        this.shape="round";
//        this.type="ballpoint";
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

//    public void setColor(String color){
//        this.color=color;
//    }

    public String getColor(){
        return color;
    }

    public void writing(){
        System.out.println("writing...");
    }

}

public class Main {
    public static void main(String[] args) {
        Pen pen_01=new Pen("myPen","blue","modern shape","gell");
//        Pen pen_01=new Pen("ali's Pen","blue");

//        pen_01.name="myPen";
//        pen_01.color="black";

//        pen_01.setName("myPen");
//        pen_01.setColor("white");
        System.out.println(pen_01.getName());
        System.out.println(pen_01.getColor());
        System.out.println(pen_01.getShape());
        System.out.println(pen_01.getType());

//        System.out.println(pen_01.name);
//        System.out.println(pen_01.color);
//        pen_01.writing();
    }
}
