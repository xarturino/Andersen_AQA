package lesson_5.fruitTask;

import lesson_5.fruitTask.Box;

public abstract class Fruit {

    protected Box boxForApple;
    protected Box boxForOrange;

     static int count = 0;

    protected Fruit() {
        count++;
    }

    abstract void addFruitInTheBox(Box boxForFruit);

}
