package lesson_4;

public class Plate {

    public static int restFood;


    public Plate(int food) {
        Plate.restFood = food;
    }

    public void decreaseFood(int foodDecrease) {
        if (restFood < foodDecrease) {
            System.out.println("Cat didn't eat");
        }
        else {
            restFood = restFood - foodDecrease;
        }
    }

    public void foodInPlateInfo() {
        if (restFood < 0) {
            System.out.println("Wrong number");
        } else {
            System.out.println("In plate there are: " + restFood + " food");
        }
    }

    public void addFoodInPlate(int addFoodNumber) {
        int newNumberOfFood = restFood + addFoodNumber;
        System.out.println("In plate there are: " + newNumberOfFood + " food");
    }
}
