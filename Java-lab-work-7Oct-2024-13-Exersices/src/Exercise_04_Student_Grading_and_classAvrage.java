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


        }if (studentNumberTwo >=90){
            System.out.println("Student number Two Score is : "+studentNumberTwo+" and Grade is A");
        } else if (studentNumberTwo >= 80) {
            System.out.println("Student number Two Score is : "+studentNumberTwo+" and Grade is B");
        }else if (studentNumberTwo >= 70) {
            System.out.println("Student number Two Score is : "+studentNumberTwo+" and Grade is C");
        }else if (studentNumberTwo >= 60) {
            System.out.println("Student number Two Score is : "+studentNumberTwo+" and Grade is D");
        }else{
            System.out.println("Student number Two Score is : "+studentNumberTwo+" and Fail");


        }if (studentNumberThree >=90){
            System.out.println("Student number three Score is : "+studentNumberThree+" and Grade is A");
        } else if (studentNumberThree >= 80) {
            System.out.println("Student number three Score is : "+studentNumberThree+" and Grade is B");
        }else if (studentNumberThree >= 70) {
            System.out.println("Student number three Score is : "+studentNumberThree+" and Grade is C");
        }else if (studentNumberThree >= 60) {
            System.out.println("Student number three Score is : "+studentNumberThree+" and Grade is D");
        }else{
            System.out.println("Student number three Score is : "+studentNumberThree+" and Fail");


        }if (studentNumberFour >=90){
            System.out.println("Student number four Score is : "+studentNumberFour+" and Grade is A");
        } else if (studentNumberFour >= 80) {
            System.out.println("Student number four Score is : "+studentNumberFour+" and Grade is B");
        }else if (studentNumberFour >= 70) {
            System.out.println("Student number four Score is : "+studentNumberFour+" and Grade is C");
        }else if (studentNumberFour >= 60) {
            System.out.println("Student number four Score is : "+studentNumberFour+" and Grade is D");
        }else{
            System.out.println("Student number four Score is : "+studentNumberFour+" and Fail");


        }if (studentNumberFive >=90){
            System.out.println("Student number Five Score is : "+studentNumberFive+" and Grade is A");
        } else if (studentNumberFive >= 80) {
            System.out.println("Student number Five Score is : "+studentNumberFive+" and Grade is B");
        }else if (studentNumberFive >= 70) {
            System.out.println("Student number Five Score is : "+studentNumberFive+" and Grade is C");
        }else if (studentNumberFive >= 60) {
            System.out.println("Student number Five Score is : "+studentNumberFive+" and Grade is D");
        }else{
            System.out.println("Student number Five Score is : "+studentNumberFive+" and Fail");
        }

        //to find the avarage  of the class
        int total=studentNumberOne+studentNumberTwo+studentNumberThree+studentNumberFour+studentNumberFive;
        float classAvarage=total/5;  //5 is the total number of student in the class
        System.out.println("Class Avarage Score is : "+classAvarage);
    }
}
