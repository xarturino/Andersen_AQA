package lesson2;


public class CreatingArrayMethod {

    public static void main(String[] args) {
        creatingArray(6,2);
    }


    static int [] creatingArray(int len, int initialValue) {
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
