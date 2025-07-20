import java.util.Scanner;

public class PK_MaxAndMin {
    Scanner s = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public PK_MaxAndMin() {
        firstNumber = s.nextInt();
        secondNumber = s.nextInt();
        thirdNumber = s.nextInt();
    }

    public void run() {
        System.out.print((firstNumber < secondNumber ? (firstNumber < thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber < thirdNumber ? secondNumber : thirdNumber)));
        System.out.print(" ");
        System.out.print((firstNumber > secondNumber ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber > thirdNumber ? secondNumber : thirdNumber)));
    }

    public static void main(String[] args) {
        PK_MaxAndMin maxAndMin = new PK_MaxAndMin();
        maxAndMin.run();
    }
}
