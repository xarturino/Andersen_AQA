package lesson_6;

public class MethodForArray {

    int sum;

    void arrayMethod(String[][] arrayOfStrings) throws MyArraySizeException, MyArrayDataException {
        String[][] strings = new String[4][4];

        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int k = 0; k<arrayOfStrings[i].length; k++) {
                if (arrayOfStrings[i][k].matches("[0-9]+")) {
                    sum = sum + Integer.parseInt(arrayOfStrings[i][k]);
                } else {
                    throw new MyArrayDataException("Values are wrong in " + "[" + i + "]" + "[" + k + "]" + arrayOfStrings[i][k]);
                }
                if (arrayOfStrings.length != strings.length || arrayOfStrings[i].length != strings[i].length) throw new MyArraySizeException("Your array length is wrong");
                System.out.print(" " + arrayOfStrings[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of array's numbers is: " + sum);
    }

    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}


class MethodForArrayTest {
    public static void main(String[] args) throws MethodForArray.MyArraySizeException, MethodForArray.MyArrayDataException {
        MethodForArray method = new MethodForArray();

        String[][] correctArray = new String[][] {{"1","2","3","4"},{"3","4","5","6"},{"5","6","7","8"},{"7","8","9","0"}};
        method.arrayMethod(correctArray);

        String[][] arraySizeException = new String[][] {{"1","2","3","4"},{"3","4","5","6"}};
        method.arrayMethod(arraySizeException);

        String[][] arrayConvertException = new String[][] {{"1","2","3","4"},{"3","4","5","6"},{"5","6","7","8"},{"7","8","9","Error"}};
        method.arrayMethod(arrayConvertException);
    }
}
