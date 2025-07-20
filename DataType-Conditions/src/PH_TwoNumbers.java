import java.util.Scanner;

public class PH_TwoNumbers {
    Scanner s = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private float result;

    public PH_TwoNumbers() {
        firstNumber = s.nextInt();
        secondNumber = s.nextInt();
        result = (float) firstNumber / secondNumber;
    }

    public void run() {
        System.out.println(
                "floor " + firstNumber + " / " + secondNumber + " = " + (int) Math.floor(result));
        System.out.println(
                "ceil " + firstNumber + " / " + secondNumber + " = " + (int) Math.ceil(result));
        System.out.println(
                "round " + firstNumber + " / " + secondNumber + " = " + (int) Math.round(result));
    }

    public static void main(String[] args) {
        PH_TwoNumbers twoNumbers = new PH_TwoNumbers();
        twoNumbers.run();
    }
}
