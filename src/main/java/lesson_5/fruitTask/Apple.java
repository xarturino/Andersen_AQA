package lesson_5.fruitTask;

public class Apple extends Fruit {

    float weight = 1.0f;
    static int count;

    Apple() {
        count++;
    }

    @Override
    public void addFruitInTheBox(Box boxForApples) {
        this.boxForApple = boxForApples;
        boxForApple.weight = weight + boxForApple.weight;
        boxForApple.count = Apple.count + boxForApple.count;
        System.out.println("Now there are " + count + " and the weight becomes " + boxForApple.weight);
    }
}
