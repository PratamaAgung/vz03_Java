package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KancilTest {

  @Test
  public void testKancil() {
    Kancil kancil = new Kancil(1, 10, 1, 100, true);   
    assertEquals(50, kancil.getJmlMakanan());
    assertEquals(1, kancil.getId());
    assertEquals(true, kancil.isJinak());
    assertEquals(10, kancil.getPosisiX());
    assertEquals(1, kancil.getPosisiY());
    assertEquals('K', kancil.getInisial());
  }

}
