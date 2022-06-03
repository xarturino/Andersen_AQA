package lesson2;

public class SumOfTwoNumbersMethod {
    public static void main(String[] args) {
        sumOfTwoNumbers(15,5);
    }

    static boolean sumOfTwoNumbers(int firstNumber, int secondNumber){
        int a = firstNumber;
        int b = secondNumber;
        if (10 < (a+b) && (a+b) <=20){
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}
