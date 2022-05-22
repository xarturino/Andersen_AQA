package lesson_13;

public class TriangleFunctions {

    //sides of triangle
    double a;
    double b;
    double c;
    //area of the triangle
    double S;
    //triangle semiperimeter
    double p;

    public double findArea(double side_a, double side_b, double side_c){
        this.a = side_a;
        this.b = side_b;
        this.c = side_c;
        if(side_a < 0 || side_b < 0 || side_c < 0){
            System.out.println("Error");
        }
        else{
            p = (a+b+c)/2;
            S=Math.sqrt((p*(p-a)*(p-b)*(p-c)));
            System.out.println("Area of triangle = " + S);
        }
        return S;
    }
}

//TODO Logger and try to understand why test are not written in report
