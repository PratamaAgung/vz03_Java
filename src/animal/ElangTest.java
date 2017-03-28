package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class ElangTest
 * ElangTest adalah kelas yang digunakan untuk mengetes kelas Elang
 * @author Iftitakhul Zakiah
 */
public class ElangTest {
	/**
	 * Test method for {@link animal.Elang#Elang(int, int, int, int, boolean)}.
	 */
	@Test
	public void testElang() {
		 Elang elang = new Elang (1, 10, 1, 100, true);

		  assertEquals(20, elang.getJmlMakanan());
		  assertEquals(1, elang.getID());
		  assertEquals(true, elang.isJinak());
		  assertEquals(10, elang.getPosisiX());
		  assertEquals(1, elang.getPosisiY());
		  assertEquals('~', elang.getInisial());
	}
}
