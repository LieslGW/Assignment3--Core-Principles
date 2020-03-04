import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
     Circle c1 = new Circle(2);

    @Test
    public void TestAreaOfCircle() throws Exception{
        //1.setRad(2);
        double c = c1.getArea();
        System.out.println(c);
        assertEquals("Radius",12.56,c,0.1);

    }
}