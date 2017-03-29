package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class BuayaTest.
   BuayaTest adalah kelas yang digunakan untuk mengetes kelas Buaya.
 * @author Iftitakhul Zakiah.  
 */
public class BuayaTest {
  /**
   * Test method for {@link animal.Buaya#Buaya(int, int, int, int, boolean)}.
   */
  @Test
  public void testBuaya() {
    Buaya buaya = new Buaya(1, 10, 1, 100, true);
    assertEquals(0, buaya.getJmlMakanan());
    assertEquals(1, buaya.getId());
    assertEquals(true, buaya.isJinak());
    assertEquals(10, buaya.getPosisiX());
    assertEquals(1, buaya.getPosisiY());
    assertEquals('D', buaya.getInisial());
  }
}
