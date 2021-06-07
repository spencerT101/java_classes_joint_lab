

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

      @Test
    public void testEmptyWaterBottle(){

          assertEquals(0, waterbottle.emptyWaterBottle());

      }

      @Test
    public void testEmptyWaterBottleAfter10Removed(){
          int num10 = 10;
          assertEquals(90,waterbottle.removeWaterBy10(num10));
          assertEquals(0, waterbottle.emptyWaterBottle());
      }

      @Test
    public void testFullBottle(){
          assertEquals(0, waterbottle.emptyWaterBottle());
          assertEquals(100, waterbottle.fillWaterBottle());

      }

      @Test
    public void testFullBottleAfter10Removed(){
          int num10 = 10;
          assertEquals(90,waterbottle.removeWaterBy10(num10));
          assertEquals(100, waterbottle.fillWaterBottle());


      }
}
