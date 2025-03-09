package composition_in_java;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase= new Case("2208","Dell","240",dimensions);

        Monitor theMonitor=new Monitor("27-inch Beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("DJ-220","Asus",4,6,"v2.44");

        PC thePC=new PC(theCase,theMonitor,theMotherboard);
        thePC.getMonitor().drwPlixelAt(1500,1200,"red");
        thePC.getMotherboard().loadPrograme("window 1.0 ");
        thePC.getTheCase().powerbuttonPress();

        

        System.out.println(thePC.getTheCase().getDimenstion().getHeight());
    }
}
