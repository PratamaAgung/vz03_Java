package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class HiuMartilTest adalah kelas yang digunakan untuk mengetes kelas HiuMartil.
 * @author Iftitakhul Zakiah.
 */

public class HiuMartilTest {

  /**
   * Test method for {@link animal.HiuMartil#HiuMartil(int, int, int, int, boolean)}.
   */
  @Test
  public void testHiuMartil() {
    HiuMartil hiuMartil = new HiuMartil(1, 10, 1, 100, true);
    assertEquals(1, hiuMartil.getJmlMakanan());
    assertEquals(1, hiuMartil.getId());
    assertEquals(true, hiuMartil.isJinak());
    assertEquals(10, hiuMartil.getPosisiX());
    assertEquals(1, hiuMartil.getPosisiY());
    assertEquals('T', hiuMartil.getInisial());
  }
}
