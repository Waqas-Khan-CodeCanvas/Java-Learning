package switch_statement.com;

public class switch_statement_in_java {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 1000; i++) {
            if (count == 20) {
                break;
            }
            if (i%3==0 && i%5==0) {
                count++;
                System.out.print(count+" : ");
                System.out.println(i);
            }

        }
    }
}
