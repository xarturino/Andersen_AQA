package lesson2;

public class PaintOverTheDiagonals {

    public static void main(String[] args) {

        //TODO: paint second diagonal +
        // Done, but don't like solution.
        int[][] squareArray= new int[5][5];
        for (int i = 0; i < squareArray.length; i++){
            for (int z = 0; z < squareArray.length; z++){
                if (i == z){
                    squareArray[i][z] = 1;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
                else if(i == 4 && z == 0){
                    squareArray[i][z] = 1;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
                else if(i == 3 && z == 1){
                    squareArray[i][z] = 1;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
                else if(z == 4 && i == 0){
                    squareArray[i][z] = 1;
                    System.out.print(" " + squareArray[i][z] + " ");
                }
                else if(z == 3 && i == 1){
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
