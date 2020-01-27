import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void initalVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolumnby10(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyReducesVolumnToZero(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillIncreasesVolOfBottleto100(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }



}
