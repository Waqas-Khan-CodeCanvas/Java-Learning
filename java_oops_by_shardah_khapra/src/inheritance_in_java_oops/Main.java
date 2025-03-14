package inheritance_in_java_oops;

public class Main {
    public static void main(String[] args) {
        Tringle tringle=new Tringle();
        tringle.color="yellow";
        tringle.printColor();
        tringle.area(12,31);

        Circle circle=new Circle();
        circle.color="red";
        circle.printColor();
        circle.area(12);

        Square square=new Square();
        square.color="blue";
        square.printColor();
        square.area(23,32);

    }
}
