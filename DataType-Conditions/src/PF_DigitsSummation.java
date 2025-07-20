import java.util.Scanner;

public class PF_DigitsSummation {
    Scanner s = new Scanner(System.in);

    private long firstNumber;
    private long secondNumber;

    public PF_DigitsSummation() {
        firstNumber = s.nextLong();
        secondNumber = s.nextLong();
    }

    public void run() {
        System.out.println(firstNumber % 10 + secondNumber % 10);
    }

    public static void main(String[] args) {
        PF_DigitsSummation digitsSummation = new PF_DigitsSummation();
        digitsSummation.run();
    }
}
