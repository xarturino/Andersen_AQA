package lesson_1;

import java.util.Scanner;

public class HomeWorkApp {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        System.out.println("Input value A: ");
        int a = in.nextInt();
        System.out.println("Input value B: ");
        int b = in.nextInt();
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        }

    static void printColor(){
        System.out.println("Input value: ");
        int value = in.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (1 < value && value <= 100){
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        System.out.println("Input value A: ");
        int a = in.nextInt();
        System.out.println("Input value B: ");
        int b = in.nextInt();
        if (a>b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }


}
