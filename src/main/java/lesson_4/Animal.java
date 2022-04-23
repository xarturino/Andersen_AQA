package lesson_4;

public class Animal {

    static String name;
    static int count;
    double distance;

    protected Animal(){
        count++;
    }

    protected void running(double distance){
        this.distance = distance;
    }

    protected void swimming(double distance){
        this.distance = distance;
    }
}


