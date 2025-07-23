public class App {

    private String personName;
    private int personAge;

    public App(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void print() {
        System.out.println("Person Name : " + personName);
        System.out.println("Person Age : " + personAge);
    }
}