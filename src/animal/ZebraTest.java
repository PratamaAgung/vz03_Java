package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZebraTest {

  @Test
  public void test() {
    Zebra zebra = new Zebra(1, 10, 1, 100, true);
    assertEquals(1, zebra.getJmlMakanan());
    assertEquals(1, zebra.getId());
    assertEquals(true, zebra.isJinak());
    assertEquals(10, zebra.getPosisiX());
    assertEquals(1, zebra.getPosisiY());
    assertEquals('Z', zebra.getInisial());
  }

}
