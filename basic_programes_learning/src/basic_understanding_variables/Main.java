package basic_understanding_variables;

public class Main {
    public static void main(String[] args) {

        int age=19;
        String myName="waqas khan";

        int myMathsMarks=123;
        System.out.println(myMathsMarks);

        String awais="awais";
        String umar="umar";

        String temp=awais;
        awais=umar;
        umar=temp;

        System.out.println("here is awais : "+awais);
        System.out.println("here is umar : "+umar);

        String concat_String=umar.concat(awais);
        System.out.println(concat_String);

    }
}
