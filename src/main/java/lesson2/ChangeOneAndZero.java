package lesson2;

public class ChangeOneAndZero {

    public static void main(String[] args) {

        int[] array = {1,1,0,0,1,0,1,1,0,0};
        System.out.print("Old array : ");
        for (int i = 0; i < array.length;i++){
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("\n");
        System.out.print("New array : ");
        for (int i = 0; i < array.length;i++){
            if (array[i] == 1){
                array[i] = 0;
            }
            else{
                array[i] = 1;
            }
            System.out.print(" " + array[i] + " ");
        }
    }
}
