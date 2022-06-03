package lesson_5.fruitTask;

public class Orange extends Fruit{

    float weight = 1.5f;
    static int count;

    Orange(){
        count++;
    }

    @Override
    public void addFruitInTheBox(Box boxForOranges) {
        this.boxForOrange = boxForOranges;
        boxForOrange.weight = weight + boxForOrange.weight;
        boxForOrange.count  = Orange.count + boxForOrange.count;
        System.out.println("Now there are " + count + " and the weight becomes " + boxForOrange.weight);
    }
}
