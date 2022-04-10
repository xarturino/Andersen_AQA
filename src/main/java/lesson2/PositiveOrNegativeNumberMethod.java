package lesson2;

public class PositiveOrNegativeNumberMethod {
    public static void main(String[] args) {
        positiveOrNegativeNumber(1980);
        positiveOrNegativeNumber(-100);
        positiveOrNegativeNumber(0);
    }

    static void positiveOrNegativeNumber(int number){
        int a = number;
        if (a>=0){
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }
    }
}
