package lesson2;

public class PositiveOrNegativeBooleanMethod {

    public static void main(String[] args) {
        positiveOrNegativeNumber(1980);
        positiveOrNegativeNumber(-100);
        positiveOrNegativeNumber(0);
    }

    static boolean positiveOrNegativeNumber(int number){
        int a = number;
        if (a >= 0){
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }
}
