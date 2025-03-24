public class Exercise_10_returni_value_from_function {
    public static void main(String[] args) {
        int lenght = 20;
        int width = 10;
        int areaOfRactangle = calculatedAreaOfRactangle(lenght, width);
        System.out.println("The area of the rectangle with length " +lenght + " and width " + width + " is " + areaOfRactangle );
    }
    public static int calculatedAreaOfRactangle(int length, int width) {
        return length * width;
    }
}
