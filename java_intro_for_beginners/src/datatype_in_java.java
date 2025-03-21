public class datatype_in_java {
    public static void main(String[] args) {
        byte number=127;
        System.out.println(number);

        int num=1234;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        type conversion in java
        //intege to string
        int intNumber=100;
        String stringNumber=Integer.toString(intNumber);

        System.out.println(intNumber+100);
        System.out.println(stringNumber+100);
        System.out.println();

        //String to integer conversion
        String strNumber="100";
        int parsIntNumber=Integer.parseInt(strNumber);
        System.out.println(stringNumber+100);
        System.out.println(parsIntNumber+100);

        System.out.println();
        float fltNumber=2.32f;
        int fltToInt=(int)fltNumber;
        System.out.println(fltNumber);
        System.out.println(fltToInt);
    }
}
