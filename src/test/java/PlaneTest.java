import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(100, plane.getCapacityEnum());
    }

    @Test
    public void canGetPlaneLoad(){
        assertEquals(10000, plane.getTotalLoadEnum());
    }


}
