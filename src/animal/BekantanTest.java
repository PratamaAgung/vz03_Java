package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BekantanTest {

  @Test
  public void testBekantan() {
    Bekantan o = new Bekantan(1, 10, 1, 100, true);

    assertEquals(10, o.getJmlMakanan());
    assertEquals(1, o.getId());
    assertEquals(true, o.isJinak());
    assertEquals(10, o.getPosisiX());
    assertEquals(1, o.getPosisiY());
    assertEquals('B', o.getInisial());
  }

}
