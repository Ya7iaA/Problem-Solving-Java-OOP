import java.util.Scanner;

public class PI_WelcomeForYouWithConditions {
    Scanner s = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;

    public PI_WelcomeForYouWithConditions() {
        firstNumber = s.nextInt();
        secondNumber = s.nextInt();
    }

    public void run() {
        System.out.println((firstNumber >= secondNumber ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        PI_WelcomeForYouWithConditions welcomeForYouWithConditions = new PI_WelcomeForYouWithConditions();
        welcomeForYouWithConditions.run();
    }
}
