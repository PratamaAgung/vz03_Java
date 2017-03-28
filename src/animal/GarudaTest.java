package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class GarudaTest
 * GarudaTest adalah kelas yang digunakan untuk mengetes kelas Garuda
 * @author Iftitakhul Zakiah
 */
public class GarudaTest {

	/**
	 * Test method for {@link animal.Garuda#Garuda(int, int, int, int, boolean)}.
	 */
	@Test
	public void testGaruda() {
		
		Garuda garuda = new Garuda (1, 10, 1, 100, true);

		  assertEquals(16, garuda.getJmlMakanan());
		  assertEquals(1, garuda.getId());
		  assertEquals(true, garuda.isJinak());
		  assertEquals(10, garuda.getPosisiX());
		  assertEquals(1, garuda.getPosisiY());
		  assertEquals('G', garuda.getInisial());
	}

}
