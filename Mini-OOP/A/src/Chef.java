public class Chef extends Employee {

    public Chef(String personName, int personAge, double employeeSalary, String employeeRole) {
        super(personName, personAge, employeeSalary, employeeRole);
    }

    @Override
    public void work() {
        System.out.println("Chef " + gerPersonName() + " is preparing dishes");
    }
}