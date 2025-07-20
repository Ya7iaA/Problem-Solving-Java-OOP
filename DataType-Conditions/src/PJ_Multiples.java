import java.util.Scanner;

public class PJ_Multiples {
    Scanner s = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;

    public PJ_Multiples() {
        firstNumber = s.nextInt();
        secondNumber = s.nextInt();
    }

    public void run() {
        System.out.println(
                (firstNumber % secondNumber == 0 || secondNumber % firstNumber == 0 ? "Multiples" : "No Multiples"));
    }

    public static void main(String[] args) {
        PJ_Multiples multiples = new PJ_Multiples();
        multiples.run();
    }
}
