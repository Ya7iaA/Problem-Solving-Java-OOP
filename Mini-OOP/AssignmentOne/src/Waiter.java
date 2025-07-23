public class Waiter extends Employee {

    public Waiter(String personName, int personAge, double employeeSalary, String employeeRole) {
        super(personName, personAge, employeeSalary, employeeRole);
    }

    @Override
    public void work() {
        System.out.println("Waiter " + gerPersonName() + " is serving customers");
    }
}