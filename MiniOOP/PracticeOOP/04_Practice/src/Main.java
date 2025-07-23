import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Player player = new Player(s.nextInt(), s.nextLine(), s.nextInt());
        player.print();
        Student student = new Student(s.nextInt(), s.nextLine(), s.nextInt());
        student.print();

        s.close();
    }
}