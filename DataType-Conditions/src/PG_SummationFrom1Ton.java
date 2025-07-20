import java.util.Scanner;

public class PG_SummationFrom1Ton {
    Scanner s = new Scanner(System.in);

    private long endNumber;
    private long result;

    public PG_SummationFrom1Ton() {
        endNumber = s.nextInt();
        result = (endNumber * (endNumber + 1)) / 2;
    }

    public void run() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        PG_SummationFrom1Ton summationFrom1Ton = new PG_SummationFrom1Ton();
        summationFrom1Ton.run();
    }
}
