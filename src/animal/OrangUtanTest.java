package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrangUtanTest {

  @Test
  public void testOrangUtan() {
    OrangUtan orangUtan = new OrangUtan(1, 10, 1, 100, true);
    assertEquals(6, orangUtan.getJmlMakanan());
    assertEquals(1, orangUtan.getId());
    assertEquals(true, orangUtan.isJinak());
    assertEquals(10, orangUtan.getPosisiX());
    assertEquals(1, orangUtan.getPosisiY());
  }

}
