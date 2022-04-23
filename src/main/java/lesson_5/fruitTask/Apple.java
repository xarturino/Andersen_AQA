package lesson_5.fruitTask;

public class Apple extends Fruit{

    float weight = 1.0f;

    @Override
    public void addFruitInTheBox(Box boxForApple) {
        this.boxForApple = boxForApple;
        boxForApple.weight = weight + boxForApple.weight;
        boxForApple.count  = Fruit.count + boxForApple.count;
        System.out.println("Now there are " + count + " and the weight becomes " + boxForApple.weight);
    }
}
