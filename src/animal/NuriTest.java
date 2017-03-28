/**
 * 
 */
package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class NuriTest
 * NuriTest adalah kelas yang digunakan untuk mengetes kelas Nuri
 * @author Iftitakhul Zakiah
 */
public class NuriTest {

	/**
	 * Test method for {@link animal.Nuri#Nuri(int, int, int, int, boolean)}.
	 */
	@Test
	public void testNuri() {
		Nuri nuri = new Nuri(1, 10, 1, 100, true);

		  assertEquals(50, nuri.getJmlMakanan());
		  assertEquals(1, nuri.getID());
		  assertEquals(true, nuri.isJinak());
		  assertEquals(10, nuri.getPosisiX());
		  assertEquals(1, nuri.getPosisiY());
		  assertEquals('N', nuri.getInisial());

	}

}
