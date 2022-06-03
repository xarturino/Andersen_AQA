package lesson2;

public class CopyStringMethod {
    public static void main(String[] args) {
        copyStringEachTimes("Hello", 5);
    }

    static void copyStringEachTimes(String string, int number){
        String str = string;
        int a = number;
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }
}
