import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void checkVolumeResult(){
        assertEquals( 100, bottle.checkVolume());
    }

    @Test
    public void checkDrinkWaterResult(){
        assertEquals( 90, bottle.drinkWater());
    }

    @Test
    public void checkEmptyBottleResult(){
        assertEquals( 0, bottle.emptyBottle());
    }

    @Test
    public void checkFillBottleResult(){
        assertEquals( 100, bottle.fillBottle());
    }


}
