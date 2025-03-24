import java.util.Scanner; //java packege for user input

public class Tutorial_04_User_Input_in_Java {
    public static void main(String[] args) {
        System.out.println("Taking input from the User");
        Scanner userName = new Scanner(System.in);
        System.out.println("Enter Your Name please?");
        String name = userName.nextLine();
        System.out.println("Your name is "+name);
        System.out.println("Enter your age here ?");
        Scanner userAge=new Scanner(System.in);
        int age =userAge.nextInt();
        System.out.println("Your age is "+age);

    }
}
//we can user these methods also
//String name = sc.nextLine();		//used to read line
//int RollNo = sc.nextInt();			//used to read int
//double Marks = sc.nextDouble();		//used to read double
//char Grade = sc.next().charAt(0);	//used to read till space

//at the end we have to close the Sccanner class input