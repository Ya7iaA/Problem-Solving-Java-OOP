public abstract class Person {

    private int personID;
    private String personName;

    public Person(int personID, String personName) {
        if (personID <= 0) {
            System.out.println("Input Error!");
            return;
        }
        this.personID = personID;
        this.personName = personName;
    }

    public int getPersonID() {
        return personID;
    }

    public String getPersonName() {
        return personName;
    }

    public abstract void print();
}