package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class AligatorTest.
   AligatorTest adalah kelas yang digunakan untuk mengetes kelas Aligator.
 * @author Iftitakhul Zakiah.
 */

public class AligatorTest {
  /**
   * Test method for {@link animal.Aligator#Aligator(int, int, int, int, boolean)}.
   */
  @Test
  public void testAligator() {
    Aligator aligator = new Aligator(1, 10, 1, 100, true);
    assertEquals(1, aligator.getJmlMakanan());
    assertEquals(1, aligator.getId());
    assertEquals(true, aligator.isJinak());
    assertEquals(10, aligator.getPosisiX());
    assertEquals(1, aligator.getPosisiY());
    assertEquals('L', aligator.getInisial());
  }
}
