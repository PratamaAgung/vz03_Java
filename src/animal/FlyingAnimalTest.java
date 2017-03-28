package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class FlyingAnimalTest
 * FlyingAnimalTest adalah kelas yang digunakan untuk mengetes kelas abstrak FlyingAnimal
 * @author Iftitakhul Zakiah
 */
public class FlyingAnimalTest {

	/**
	 * Test method for {@link animal.FlyingAnimal#FlyingAnimal(char, int)}.
	 */
	@Test
	public void testFlyingAnimal() {
		 Elang elang = new Elang (1, 10, 1, 100, true);

		  assertEquals(20, elang.getJmlMakanan());
		  assertEquals(1, elang.getId());
		  assertEquals(true, elang.isJinak());
		  assertEquals(10, elang.getPosisiX());
		  assertEquals(1, elang.getPosisiY());
		  assertEquals('~', elang.getInisial());
	}

}
