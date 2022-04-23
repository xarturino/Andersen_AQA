package lesson_4;

public class Cat extends Animal{

    private int appetite;
    public boolean satiety = false;

    Cat(String name){
        Animal.name = name;
        System.out.println("Cat " + name + " is Creating");
    }

    Cat(String name, int appetite){
        Animal.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    protected void running(double distance) {
        super.running(distance);
        double maxDistance = 200.00;
        if(distance > maxDistance){
            System.out.println(Animal.name + " is dead");
        }
        else{
            System.out.println(Animal.name + " runs distance equals " + distance);
        }
    }

    @Override
    protected void swimming(double distance){
        super.swimming(distance);
        double maxDistance = 0.00;
        if (distance > maxDistance){
            System.out.println(Animal.name + " is dead");
        }
        else{
            System.out.println(Animal.name + " swims distance equals " + distance);
        }
    }

    protected void catIsEating(Plate plate){
        plate.decreaseFood(appetite);
        if (appetite <= Plate.restFood && Plate.restFood != 0){
            satiety = true;
            System.out.println("Cat is satiety");
        }
    }
}

class CatTest{
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Sven", 10);
        cats[1] = new Cat("Snowball", 20);
        cats[2] = new Cat("Snowball_2", 35);
        cats[3] = new Cat("Snowball_3", 15);
        cats[4] = new Cat("Snowball_4", 50);

        Plate plate = new Plate(120);

        plate.foodInPlateInfo();
        cats[0].catIsEating(plate);
        cats[1].catIsEating(plate);
        cats[2].catIsEating(plate);
        cats[3].catIsEating(plate);
        cats[4].catIsEating(plate);
        plate.foodInPlateInfo();
        plate.addFoodInPlate(100);
    }
}

