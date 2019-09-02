import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void Before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canRefill() {
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());

    }
}
