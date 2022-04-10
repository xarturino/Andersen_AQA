package lesson2;

public class PaintOverTheDiagonals {

    public static void main(String[] args) {

        //TODO: paint second diagonal
        int[][] squareArray= new int[5][5];
        for (int i = 0; i < squareArray.length; i++){
            for (int z = 0; z < squareArray.length; z++){
                if (i == z){
                    squareArray[i][z] = 1;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
                else{
                    squareArray[i][z] = 0;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
            }
            System.out.println();
        }
    }
}
