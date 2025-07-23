public class App {

    private String personName;
    private int personAge;

    public App(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public void print() {
        System.out.println("Person Name : " + personName);
        System.out.println("Person Age : " + personAge);
    }
}