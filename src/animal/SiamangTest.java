package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SiamangTest {

  @Test
  public void testSiamang() {
    Siamang o = new Siamang(1, 10, 1, 100, true);

    assertEquals(20, o.getJmlMakanan());
    assertEquals(1, o.getId());
    assertEquals(true, o.isJinak());
    assertEquals(10, o.getPosisiX());
    assertEquals(1, o.getPosisiY());
    assertEquals('S', o.getInisial());
  }

}
