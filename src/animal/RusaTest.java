package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RusaTest {

  @Test
  public void testRusa() {
    Rusa rusa = new Rusa(1, 10, 1, 100, true);
    assertEquals(5, rusa.getJmlMakanan());
    assertEquals(1, rusa.getId());
    assertEquals(true, rusa.isJinak());
    assertEquals(10, rusa.getPosisiX());
    assertEquals(1, rusa.getPosisiY());
    assertEquals('E', rusa.getInisial());
  }

}
