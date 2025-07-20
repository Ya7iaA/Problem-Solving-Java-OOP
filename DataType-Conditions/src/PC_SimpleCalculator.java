import java.util.Scanner;

public class PC_SimpleCalculator {
    Scanner s = new Scanner(System.in);

    private long firstNumber;
    private long secondNumber;

    public PC_SimpleCalculator() {
        firstNumber = s.nextLong();
        secondNumber = s.nextLong();
    }

    public void run() {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }

    public static void main(String[] args) {
        PC_SimpleCalculator simpleCalculator = new PC_SimpleCalculator();
        simpleCalculator.run();
    }
}
