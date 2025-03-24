public class QuestionNo_07 {
    public static void main(String[] args) {
        //Demonstrating Overflow and Underflow for int
        int minValueOfInt = Integer.MIN_VALUE;
        int maxValueOfInt = Integer.MAX_VALUE;

        System.out.println("Maximum value of int : " + maxValueOfInt);
        System.out.println("Minimum value of int : " + minValueOfInt);

        int overFlowForInt = maxValueOfInt+1 ;
        int underFlowForInt = minValueOfInt-1 ;

        System.out.println("Overflow value for integer : " + overFlowForInt);
        System.out.println("Underflow value for integer : " + underFlowForInt);

        //Demonstrating Overflow and Underflow for Byte
        byte maxValueOfByte = Byte.MAX_VALUE ;
        byte minValueOfByte = Byte.MIN_VALUE ;

        System.out.println("Maximum value of Byte : " + maxValueOfByte );
        System.out.println("Minimum value of Byte : " + minValueOfByte );

        byte overFlowForByte= (byte) (maxValueOfByte+1);
        byte underFlowForByte = (byte) (minValueOfByte-1);

        System.out.println("Overflow value for Byte : " + overFlowForByte );
        System.out.println("Underflow value for Byte : " + underFlowForByte );
    }
}
