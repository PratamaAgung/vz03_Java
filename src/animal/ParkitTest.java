package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class ParkitTest adalah kelas yang digunakan untuk mengetes kelas Parkit.
 * @author Iftitakhul Zakiah.
 */
public class ParkitTest {

  /**
   * Test method for {@link animal.Parkit#Parkit(int, int, int, int, boolean)}.
   */
  @Test
  public void testParkit() {
    Parkit parkit = new Parkit(1, 10, 1, 100, true);
    assertEquals(20, parkit.getJmlMakanan());
    assertEquals(1, parkit.getId());
    assertEquals(true, parkit.isJinak());
    assertEquals(10, parkit.getPosisiX());
    assertEquals(1, parkit.getPosisiY());
    assertEquals('F', parkit.getInisial());
  }

}
