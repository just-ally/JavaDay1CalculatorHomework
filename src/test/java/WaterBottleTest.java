import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.takeDrink();
        waterBottle.takeDrink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill(){
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}
