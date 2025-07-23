public class Student extends Person {
    
    private int studentAge;

    public Student(int studentID, String studentName, int studentAge) {
        super(studentID, studentName);
        if (studentAge <= 7 || studentAge >= 30) {
            System.out.println("Input Error!");
            return;
        }
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public void print() {
        System.out.println("The Student ID is : " + getPersonID());
        System.out.println("The Student Name is : " + getPersonName());
        System.out.println("The Student Age is : " + studentAge);
    }
}