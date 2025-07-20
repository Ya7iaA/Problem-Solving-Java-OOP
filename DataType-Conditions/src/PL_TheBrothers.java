import java.util.Scanner;

public class PL_TheBrothers {
    Scanner s = new Scanner(System.in);

    private String firstPersonFirstName = s.next();
    private String firstPersonLastName = s.next();
    private String secondPersonFirstName = s.next();
    private String secondPersonLastName = s.next();

    public PL_TheBrothers() {
        firstPersonFirstName = s.next();
        firstPersonLastName = s.next();
        secondPersonFirstName = s.next();
        secondPersonLastName = s.next();
    }

    public void run() {
        System.out.println((firstPersonLastName.equals(secondPersonLastName) ? "ARE Brothers" : "NOT"));
    }

    public static void main(String[] args) {
        PL_TheBrothers brothers = new PL_TheBrothers();
        brothers.run();
    }
}
