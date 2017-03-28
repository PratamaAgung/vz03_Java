/**
 * 
 */
package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class WaterAnimalTest
 * WaterAnimalTest adalah kelas yang digunakan untuk mengetes kelas abstrak WaterAnimal
 * @author Iftitakhul Zakiah
 */
public class WaterAnimalTest {

	/**
	 * Test method for {@link animal.WaterAnimal#WaterAnimal(char, int)}.
	 */
	@Test
	public void testWaterAnimal() {
		MantaRay mantaRay = new MantaRay(1, 10, 1, 100, true);

		  assertEquals(0, mantaRay.getJmlMakanan());
		  assertEquals(1, mantaRay.getId());
		  assertEquals(true, mantaRay.isJinak());
		  assertEquals(10, mantaRay.getPosisiX());
		  assertEquals(1, mantaRay.getPosisiY());
		  assertEquals('Q', mantaRay.getInisial());
	}

}
