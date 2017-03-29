package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SiamangTest {

  @Test
  public void testSiamang() {
    Siamang siamang = new Siamang(1, 10, 1, 100, true);
    assertEquals(20, siamang.getJmlMakanan());
    assertEquals(1, siamang.getId());
    assertEquals(true, siamang.isJinak());
    assertEquals(10, siamang.getPosisiX());
    assertEquals(1, siamang.getPosisiY());
    assertEquals('S', siamang.getInisial());
  }

}
