package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class LandAnimalTest {

  @Test
  public void testLandAnimal() {
    LandAnimal o = new BadakCulaSatu(1, 10, 1, 100, true);

    assertEquals(0, o.getJmlMakanan());
    assertEquals(1, o.getId());
    assertEquals(true, o.isJinak());
    assertEquals(10, o.getPosisiX());
    assertEquals(1, o.getPosisiY());
    assertEquals('C', o.getInisial());
  }

}
