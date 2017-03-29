package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IguanaTest {

  @Test
  public void testIguana() {
    Iguana iguana = new Iguana(1, 10, 1, 100, true);

    assertEquals(12, iguana.getJmlMakanan());
    assertEquals(1, iguana.getId());
    assertEquals(true, iguana.isJinak());
    assertEquals(10, iguana.getPosisiX());
    assertEquals(1, iguana.getPosisiY());
    assertEquals('I', iguana.getInisial());
  }

}
