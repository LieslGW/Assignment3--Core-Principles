import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    public Rectangle r1 = new Rectangle(5,3);



    @Test
    public void calcAreaOfRectangle() throws Exception {

        //r1.getArea();
        System.out.println(r1.getArea());
        assertEquals((int)15, (int)r1.getArea());

    }


}