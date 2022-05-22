package lesson_13;

import org.junit.jupiter.api.Test;
import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleFunctionsTest {
    TriangleFunctions triangleFunctions = new TriangleFunctions();

    @Test
    void findCorrectAreaOfTriangle(){
        double expectedArea = 11.313708498984761;
        double actualArea = triangleFunctions.findArea(6,6,4);
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void triangleWithWrongSides(){
        double area = triangleFunctions.findArea(12,4,6);
        assertEquals(NaN,area);
    }

    @Test
    void negativeNumbersOfSides(){
        double area = triangleFunctions.findArea(-3,-9,-5);
        assertEquals(0.0,area);
    }
}
