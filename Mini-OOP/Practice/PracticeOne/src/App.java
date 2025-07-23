import java.util.Scanner;

public class App {
    Scanner s = new Scanner(System.in);

    private String personName;
    private int personAge;

    public App() {
        personName = s.nextLine();
        personAge = s.nextInt();
    }

    public void print() {
        System.out.println("Person Name : " + personName);
        System.out.println("Person Age : " + personAge);
    }
}