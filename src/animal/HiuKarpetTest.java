/**
 * 
 */
package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class HiuKarpetTest
 * HiuKarpetTest adalah kelas yang digunakan untuk mengetes kelas HiuKarpet
 * @author Iftitakhul Zakiah
 */
public class HiuKarpetTest {

	/**
	 * Test method for {@link animal.HiuKarpet#HiuKarpet(int, int, int, int, boolean)}.
	 */
	@Test
	public void testHiuKarpet() {
		HiuKarpet hiuKarpet = new HiuKarpet(1, 10, 1, 100, true);

		  assertEquals(1, hiuKarpet.getJmlMakanan());
		  assertEquals(1, hiuKarpet.getID());
		  assertEquals(true, hiuKarpet.isJinak());
		  assertEquals(10, hiuKarpet.getPosisiX());
		  assertEquals(1, hiuKarpet.getPosisiY());
		  assertEquals('V', hiuKarpet.getInisial());
	}

}
