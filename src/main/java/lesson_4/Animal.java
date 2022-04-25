package lesson_4;

public class Animal {

    static String name;
    static int count;
    double distance;

    protected Animal(){
        count++;
        System.out.println("There are " + count + " animals");
    }

    protected void running(double distance){
        this.distance = distance;
    }

    protected void swimming(double distance){
        this.distance = distance;
    }
}


class AnimalTest{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.running(100);
        Dog dog = new Dog("Steve");
        dog.running(100);
        dog.swimming(10);
        dog.running(2000);
        dog.swimming(400);

        Cat cat = new Cat("Sven");
        cat.running(100);
        cat.swimming(10);
        cat.running(2000);


    }
}