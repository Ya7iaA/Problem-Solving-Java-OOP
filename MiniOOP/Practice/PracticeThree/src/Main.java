import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Summation summation = new Summation(s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("The Summation is : " + summation.theSum());

        s.close();
    }
}