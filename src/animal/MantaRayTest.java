package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class MantaRayTest.
   MantaRayTest adalah kelas yang digunakan untuk mengetes kelas MantaRay.
 * @author Iftitakhul Zakiah.
 */
public class MantaRayTest {

  /**
   * Test method for {@link animal.MantaRay#MantaRay(int, int, int, int, boolean)}.
   */
  @Test
  public void testMantaRay() {
    MantaRay mantaRay = new MantaRay(1, 10, 1, 100, true);
    assertEquals(0, mantaRay.getJmlMakanan());
    assertEquals(1, mantaRay.getId());
    assertEquals(true, mantaRay.isJinak());
    assertEquals(10, mantaRay.getPosisiX());
    assertEquals(1, mantaRay.getPosisiY());
    assertEquals('Q', mantaRay.getInisial());
  }
}
