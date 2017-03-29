package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BekantanTest {

  @Test
  public void testBekantan() {
    Bekantan bekantan = new Bekantan(1, 10, 1, 100, true);
    assertEquals(10, bekantan.getJmlMakanan());
    assertEquals(1, bekantan.getId());
    assertEquals(true, bekantan.isJinak());
    assertEquals(10, bekantan.getPosisiX());
    assertEquals(1, bekantan.getPosisiY());
    assertEquals('B', bekantan.getInisial());
  }

}
