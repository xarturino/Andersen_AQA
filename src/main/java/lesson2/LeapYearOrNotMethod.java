package lesson2;

public class LeapYearOrNotMethod {
    //info from https://ru.wikihow.com/высчитывать-високосные-годы

    public static void main(String[] args) {
        leapYear(2000);
        leapYear(2007);
        leapYear(1993);
        leapYear(2024);
    }

    static boolean leapYear(double year) {
        double a = year;
        if (a % 4 == 0) {
            System.out.println("Leap");
            return true;
        } else if (a % 100 == 0 || a % 400 == 0) {
            System.out.println("Leap");
            return true;
        } else {
            System.out.println("Not leap");
            return false;
        }
    }
}
