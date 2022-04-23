package lesson_5.fruitTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<Fruit, Apple, Orange>{

    public int count;
    private Apple apple;
    private Orange orange;

    public float weight;

    public Box(Fruit fruit){
        weight = 0;
    }

    //TODO - try to understand how to save an object in the box
    void boxInfo(){
        System.out.println();
        System.out.println("Box weight: " + weight);
    }

}



class BoxTest{
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box<Fruit, Object, Object> boxForApples = new Box<Fruit, Object, Object>(apple);
        boxForApples.boxInfo();
        apple.addFruitInTheBox(boxForApples);
        boxForApples.boxInfo();
        Apple apple2 = new Apple();
        apple2.addFruitInTheBox(boxForApples);
        boxForApples.boxInfo();
        Apple apple3 = new Apple();
        apple3.addFruitInTheBox(boxForApples);
        boxForApples.boxInfo();
    }
}
