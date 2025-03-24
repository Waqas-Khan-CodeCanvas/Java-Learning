public class Exercise_11_passing_arguments_to_function {
    public static void main(String[] args) {
        displayEmployeeInfo("ali", 2005);
        displayEmployeeInfo("John Doe", 1994);
        displayEmployeeInfo("Jane Smith", 1999);
    }

    public static void displayEmployeeInfo(String name, int DOB) {
        int calculatedAge = 2024 - DOB;
        System.out.println("Employee Name: " + name + ", Age: " + calculatedAge);
    }
}
