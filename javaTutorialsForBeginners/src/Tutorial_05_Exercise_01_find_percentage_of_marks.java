import java.util.Scanner;

public class Tutorial_05_Exercise_01_find_percentage_of_marks {
    public static void main(String[] args) {
        System.out.println("Find the Percentage of a Student marks");
        System.out.println("Enter your English marks");
        Scanner engMark=new Scanner(System.in);
        int engMarks=engMark.nextInt();
        System.out.println("Enter your Maths marks");
        Scanner mathMark =new Scanner(System.in);
        int mathMarks= mathMark.nextInt();
        System.out.println("Enter your Urdu marks");
        Scanner urduMark =new Scanner(System.in);
        int urduMarks= urduMark.nextInt();
        System.out.println("Enter your Calculus marks");
        Scanner calculusMark =new Scanner(System.in);
        int calculusMarks= calculusMark.nextInt();

        float obtaindMarks=engMarks+mathMarks+urduMarks+calculusMarks;
        System.out.println(obtaindMarks);
        float totalMarks=550;
        System.out.println(totalMarks);
        float percentageOfMarks= (obtaindMarks/totalMarks);
        System.out.printf("%.2f",percentageOfMarks);
        System.out.println("The percentage of your marks is :"+percentageOfMarks);

    }
}
