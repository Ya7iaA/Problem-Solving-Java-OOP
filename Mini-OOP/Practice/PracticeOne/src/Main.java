import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        App app = new App(s.nextLine(), s.nextInt());
        app.print();

        s.close();
    }
}