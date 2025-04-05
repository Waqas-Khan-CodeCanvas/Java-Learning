package lecture_07;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person); // Implicitly calls person.toString()
    }
}
