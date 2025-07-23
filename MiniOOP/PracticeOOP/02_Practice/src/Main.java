import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Player player = new Player(s.nextLine(), s.nextInt());
        player.print();

        s.close();
    }
}