public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmed", 22);
        person.introduce();
        System.out.println("---------------------------");
        Employee employee = new Employee("Ahmed", 22, 2500, "Teacher");
        employee.work();
        System.out.println("---------------------------");
        Chef chef = new Chef("Ahmed", 22, 3500, "Chef");
        chef.work();
        System.out.println("---------------------------");
        Waiter waiter = new Waiter("Ahmed", 22, 1750, "Waiter");
        waiter.work();
    }
}