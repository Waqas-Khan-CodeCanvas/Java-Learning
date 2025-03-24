public class Loops_for_Loop_02 {
    public static void main(String[] args) {
        double principalSalary=10000; //intial amount
        double interstRate=0.05;      //interst rate

        for (int year = 1; year < 5; year++) {
            double interest=principalSalary*interstRate;
            principalSalary+=interest;
            System.out.println("Year "+year+" : $"+(int)(principalSalary));
        }
    }
}
