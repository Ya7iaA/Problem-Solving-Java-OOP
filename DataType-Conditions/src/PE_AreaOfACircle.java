import java.util.Scanner;

public class PE_AreaOfACircle {
    Scanner s = new Scanner(System.in);

    private double radiusCircle;
    private final double piValue = 3.141592653;
    private double result;

    public PE_AreaOfACircle() {
        radiusCircle = s.nextDouble();
        result = radiusCircle * radiusCircle * piValue;
    }

    public void run() {
        System.out.printf("%.9f\n", result);
    }

    public static void main(String[] args) {
        PE_AreaOfACircle areaOfACircle = new PE_AreaOfACircle();
        areaOfACircle.run();
    }
}
