package lesson2;

public class FillingTheArray {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 1;i<array.length;i++){
            array[i] = i;
            System.out.print(" " + array[i] + " ");
        }
    }
}
/*
* if the counter starts with 0, then the final value of 100 is possible,
* if the counter starts with 1, then the extreme value of the array, based on the length of 100, will be 99
* */