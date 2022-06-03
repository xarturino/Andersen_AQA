package lesson_5.fruitTask;

import java.util.ArrayList;

import static lesson_5.fruitTask.Box.compare;

public class Box<T extends Fruit> {

    public int count;
    public float weight;
    public ArrayList<T> box;

    public Box() {
        weight = 5;
        box = new ArrayList<T>();
    }

    //TODO - try to understand how to save an object in the box
    // DONE.
    void getWeight() {
        System.out.println();
        System.out.println("Box weight: " + weight);
    }

    static boolean compare(Box<Fruit> box1, Box<Fruit> box2) {
        box1.getWeight();
        box2.getWeight();
        if (box1.weight == box2.weight) {
            System.out.println("Weights are equal");
            return true;
        } else {
            System.out.println("Weights aren't equal");
            return false;
        }
    }

    // situation with clone method - objects were cloned, but parameters of the FruitBox were the same as before operation
    // tried to fix that with default values
    // I this realization is weak.
    void getFruitsToAnotherBox(Box withFruitsBox) {
        Box newBox = new Box();
        newBox.box = (ArrayList) withFruitsBox.box.clone();
        newBox.count = withFruitsBox.count;
        newBox.weight = withFruitsBox.weight;
        withFruitsBox.box.clear();
        withFruitsBox.count = 0;
        withFruitsBox.weight = 5;
        System.out.println("New box: " + newBox.box);
        System.out.println("Box from the parameter: " + withFruitsBox.box);
    }
}


class BoxTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Box<Fruit> boxForApples = new Box<>();
        boxForApples.getWeight();
        Apple apple = new Apple();
        apple.addFruitInTheBox(boxForApples);
        boxForApples.box.add(apple);
        boxForApples.getWeight();
        Apple apple2 = new Apple();
        apple2.addFruitInTheBox(boxForApples);
        boxForApples.getWeight();
        boxForApples.box.add(apple2);

        Orange orange = new Orange();
        Box<Fruit> boxForOranges = new Box<>();
        boxForOranges.getWeight();
        orange.addFruitInTheBox(boxForOranges);
        boxForOranges.box.add(orange);
        Orange orange2 = new Orange();
        orange.addFruitInTheBox(boxForOranges);
        boxForOranges.box.add(orange2);


        compare(boxForOranges, boxForApples);

        boxForApples.getFruitsToAnotherBox(boxForApples);

        boxForOranges.getFruitsToAnotherBox(boxForOranges);
    }
}

