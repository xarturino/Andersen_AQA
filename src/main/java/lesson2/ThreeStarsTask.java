package lesson2;


import java.util.Arrays;

public class ThreeStarsTask {
    //TODO: trying to do task
    // Done. +/-

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        shiftArrayPositiveNumber(array, 2);
        shiftArrayNegativeNumber(array,-2);
    }


    static void shiftArrayPositiveNumber(int [] array, int shiftPositiveNumber){

        int shift = array[shiftPositiveNumber];
        for (int i = shiftPositiveNumber; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = shift;
        System.out.println(Arrays.toString(array));
    }

    // запутался, надо подумать
    static void shiftArrayNegativeNumber(int [] array, int shiftNegativeNumber){

        int shift = array[Math.abs(shiftNegativeNumber)];
        for (int i = shiftNegativeNumber; i < 0; i++){
            array[Math.abs(i)] = array[Math.abs(i)+1];
        }
        array[0] = shift;
        System.out.println(Arrays.toString(array));
    }
}
