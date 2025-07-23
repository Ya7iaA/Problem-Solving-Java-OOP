public class Summation {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Summation(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber % 2 != 0 || secondNumber % 2 != 0 || thirdNumber % 2 != 0) {
            System.out.println("Input Error!");
        } else {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
            this.thirdNumber = thirdNumber;
        }
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public int theSum() {
        if (firstNumber % 2 != 0 || secondNumber % 2 != 0 || thirdNumber % 2 != 0) {
            return -1;
        } else {
            return firstNumber + secondNumber + thirdNumber;
        }
    }
}