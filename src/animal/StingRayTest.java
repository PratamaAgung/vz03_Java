package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class StingRayTest.
 * StingRayTest adalah kelas yang digunakan untuk mengetes kelas StingRay.
 * @author Iftitakhul Zakiah.
 */
public class StingRayTest {

  /**
   * Test method for {@link animal.StingRay#StingRay(int, int, int, int, boolean)}.
   */
  @Test
  public void testStingRay() {
    StingRay stingRay = new StingRay(1, 10, 1, 100, true);

      assertEquals(10, stingRay.getJmlMakanan());
      assertEquals(1, stingRay.getId());
      assertEquals(true, stingRay.isJinak());
      assertEquals(10, stingRay.getPosisiX());
      assertEquals(1, stingRay.getPosisiY());
      assertEquals('Y', stingRay.getInisial());

  }

}
