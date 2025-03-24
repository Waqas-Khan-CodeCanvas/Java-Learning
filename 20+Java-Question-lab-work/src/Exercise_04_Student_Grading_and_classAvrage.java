public class Exercise_04_Student_Grading_and_classAvrage {
    public static void main(String[] args) {
        int studentNumberOne = 69;
        int studentNumberTwo = 90;
        int studentNumberThree = 89;
        int studentNumberFour = 85;
        int studentNumberFive = 69;

        if (studentNumberOne >=90){
            System.out.println("Student number One Score is : "+studentNumberOne+" and Grade is A");
        } else if (studentNumberOne >= 80) {
            System.out.println("Student number One Score is : "+studentNumberOne+" and Grade is B");
        }else if (studentNumberOne >= 70) {
            System.out.println("Student number One Score is : "+studentNumberOne+" and Grade is C");
        }else if (studentNumberOne >= 60) {
            System.out.println("Student number One Score is : "+studentNumberOne+" and Grade is D");
        }else{
            System.out.println("Student number One Score is : "+studentNumberOne+" and Fail");

        //to find the avarage  of the class
        int total=studentNumberOne+studentNumberTwo+studentNumberThree+studentNumberFour+studentNumberFive;
        float classAvarage=total/5;  //5 is the total number of student in the class
        System.out.println("Class Avarage Score is : "+classAvarage);
    }
}
}
