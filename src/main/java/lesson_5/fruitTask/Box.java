package lesson_5.fruitTask;

import java.util.ArrayList;

public class Box<Fruit>{

    public int count;
    public float weight;
    Fruit fruit;
    public ArrayList<Fruit> box;

    public Box(){
        weight = 5;
        box = new ArrayList<Fruit>();
    }

    //TODO - try to understand how to save an object in the box
    void getWeight(){
        System.out.println();
        System.out.println("Box weight: " + weight);
    }

    static boolean compare(Box box1, Box box2){
        box1.getWeight();
        box2.getWeight();
        if(box1.weight == box2.weight){
            System.out.println("Weights are equal");
            return true;
        }
        else{
            System.out.println("Weights aren't equal");
            return false;
        }
    }

    void applesInTheBox(){
        System.out.println(box);
        }

    void getFruitsToAnotherBox(Box boxWithFruits, Box boxWithoutFruits){;

    }


}



class BoxTest{
    public static void main(String[] args) {
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
        boxForApples.applesInTheBox();

        Orange orange = new Orange();
        Box<Fruit> boxForOranges = new Box<>();
        boxForOranges.getWeight();
        orange.addFruitInTheBox(boxForOranges);
        boxForOranges.box.add(orange);
        Orange orange2 = new Orange();
        orange.addFruitInTheBox(boxForOranges);
        boxForOranges.box.add(orange2);

    }
}

