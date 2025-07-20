import java.util.Scanner;

public class PD_Difference {
    Scanner s = new Scanner(System.in);

    private long firstNumber;
    private long secondNumber;
    private long thirdNumber;
    private long fourthNumber;

    public PD_Difference() {
        firstNumber = s.nextLong();
        secondNumber = s.nextLong();
        thirdNumber = s.nextLong();
        fourthNumber = s.nextLong();
    }

    public void run() {
        System.out.println("Difference = " + (firstNumber * secondNumber - thirdNumber * fourthNumber));
    }

    public static void main(String[] args) {
        PD_Difference difference = new PD_Difference();
        difference.run();
    }
}
