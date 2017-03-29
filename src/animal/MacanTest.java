package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MacanTest {

  @Test
  public void testMacan() {
    Macan macan = new Macan(1, 10, 1, 100, true);
    assertEquals(8, macan.getJmlMakanan());
    assertEquals(1, macan.getId());
    assertEquals(true, macan.isJinak());
    assertEquals(10, macan.getPosisiX());
    assertEquals(1, macan.getPosisiY());
    assertEquals('M', macan.getInisial());
  }
}
