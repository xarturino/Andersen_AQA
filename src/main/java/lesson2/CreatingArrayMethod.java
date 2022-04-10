package lesson2;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class CreatingArrayMethod {

    public static void main(String[] args) {
        creatingArray(6,2);
    }

    @Contract(pure = true)
    static int @NotNull [] creatingArray(int len, int initialValue) {
        int a = len;
        int b = initialValue;
        int array[] = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = b;
            System.out.print(" " + array[i] + " ");
        }
        return array;
    }
}
