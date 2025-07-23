import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student student = new Student(s.nextInt(), s.nextLine(), s.nextLine(), s.nextInt());
        student.print();
        Player player = new Player(s.nextInt(), s.nextLine(), s.nextLine(), s.nextInt());
        player.print();

        s.close();
    }
}