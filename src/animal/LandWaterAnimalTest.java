package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @class LandWaterAnimalTest.
   LandWaterAnimalTest adalah kelas yang digunakan untuk mengetes kelas abstrak LandWaterAnimal.
 * @author Iftitakhul Zakiah.
 */
public class LandWaterAnimalTest {

  /**
   * Test method for {@link animal.LandWaterAnimal#LandWaterAnimal(char, int)}.
   */
  @Test
  public void testLandWaterAnimal() {
    Aligator aligator = new Aligator(1, 10, 1, 100, true);
    assertEquals(1, aligator.getJmlMakanan());
    assertEquals(1, aligator.getId());
    assertEquals(true, aligator.isJinak());
    assertEquals(10, aligator.getPosisiX());
    assertEquals(1, aligator.getPosisiY());
    assertEquals('L', aligator.getInisial());
  }
}
