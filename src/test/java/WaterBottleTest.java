

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
      WaterBottle waterbottle;
      @Before
    public void before(){
    waterbottle = new WaterBottle(100);

      }

      @Test
    public void testRemoveWaterBy10(){
         int num10 = 10;

          assertEquals(90, waterbottle.removeWaterBy10(num10));
      }

}
