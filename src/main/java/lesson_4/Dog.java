package lesson_4;

public class Dog extends Animal {

    Dog(String name) {
        Animal.name = name;
        System.out.println("Dog " + name + " is creating");
    }

    @Override
    protected void running(double distance) {
        super.running(distance);
        double maxDistance = 500.00;
        if (distance > maxDistance) {
            System.out.println(Animal.name + " is dead");
        } else {
            System.out.println(Animal.name + " runs distance equals " + distance);
        }
    }

    @Override
    protected void swimming(double distance) {
        super.swimming(distance);
        double maxDistance = 10.00;
        if (distance > maxDistance) {
            System.out.println(Animal.name + " is dead");
        } else {
            System.out.println(Animal.name + " swims distance equals " + distance);
        }
    }
}

