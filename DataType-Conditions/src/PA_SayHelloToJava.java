import java.util.Scanner;

public class PA_SayHelloToJava {
    Scanner s = new Scanner(System.in);

    private String inputName;

    public PA_SayHelloToJava() {
        inputName = s.nextLine();
    }

    public void run() {
        System.out.println("Hello, " + inputName);
    }

    public static void main(String[] args) {
        PA_SayHelloToJava sayHelloToJava = new PA_SayHelloToJava();
        sayHelloToJava.run();
    }
}
