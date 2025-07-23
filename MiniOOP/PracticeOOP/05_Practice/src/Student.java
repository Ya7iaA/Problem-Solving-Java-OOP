public class Student extends SharedData {

    private int studentAge;

    public Student(int studentID, String studentName, String studentPhone, int studentAge) {
        super(studentID, studentName, studentPhone);
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public void print() {
        System.out.println("The Player ID is : " + getID());
        System.out.println("The Player Name is : " + getName());
        System.out.println("The Player Phone is : " + getPhone());
        System.out.println("The Player Number is : " + studentAge);
    }
}