import junit.framework.Assert;
import lesson_13.TriangleFunctions;
import org.junit.jupiter.api.Test;
import static java.lang.Double.NaN;

public class TriangleFunctionsTest {

    TriangleFunctions triangleFunctions = new TriangleFunctions();

    @Test
    void findCorrectAreaOfTriangle(){
        double expectedArea = 11.313708498984761;
        double actualArea = triangleFunctions.findArea(6,6,4);
        Assert.assertEquals(expectedArea,actualArea);
    }

    @Test
    void triangleWithWrongSides(){
        double area = triangleFunctions.findArea(12,4,6);
        Assert.assertEquals(NaN,area);
    }

    @Test
    void negativeNumbersofSides(){
        double area = triangleFunctions.findArea(-3,-9,-5);
        Assert.assertEquals(0.0,area);
    }
}
