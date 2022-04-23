package lesson_5;

// solution with numbers
//TODO - solution with reference type of object
public class _01_ChangingMethod<T extends Number> {
    private T[] numbers;

    public _01_ChangingMethod(T[] numbers){
        this.numbers = numbers;
    }

    private void showNumbers(){
        for (T number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("Then the method swap is starting");
    }

    private void swapNumbers(T[] numbers, int i, int j){
        T temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        for (T number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Number[] array;
        _01_ChangingMethod<Number> method = new _01_ChangingMethod<>(array = new Number[]{1, 2, 3, 4, 5, 6});
        method.showNumbers();
        method.swapNumbers(array,5,2);

    }
}
