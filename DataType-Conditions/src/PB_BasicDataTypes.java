import java.util.Scanner;

public class PB_BasicDataTypes {
    Scanner s = new Scanner(System.in);

    private int integerValue;
    private long longValue;
    private char charValue;
    private float floatValue;
    private double doubleValue;

    public PB_BasicDataTypes() {
        integerValue = s.nextInt();
        longValue = s.nextLong();
        charValue = s.next().charAt(0);
        floatValue = s.nextFloat();
        doubleValue = s.nextDouble();
    }

    public void run() {
        System.out.println(integerValue);
        System.out.println(longValue);
        System.out.println(charValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }

    public static void main(String[] args) {
        PB_BasicDataTypes basicDataTypes = new PB_BasicDataTypes();
        basicDataTypes.run();
    }
}
