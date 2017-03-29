package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LandAnimalTest {

  @Test
  public void testLandAnimal() {
    LandAnimal badak = new BadakCulaSatu(1, 10, 1, 100, true);

    assertEquals(0, badak.getJmlMakanan());
    assertEquals(1, badak.getId());
    assertEquals(true, badak.isJinak());
    assertEquals(10, badak.getPosisiX());
    assertEquals(1, badak.getPosisiY());
    assertEquals('C', badak.getInisial());
  }

}
