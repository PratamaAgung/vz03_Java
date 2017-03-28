package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class MacanTest {

	@Test
	public void testMacan() {
		Macan o = new Macan(1, 10, 1, 100, true);

		assertEquals(8, o.getJmlMakanan());
		assertEquals(1, o.getID());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
		assertEquals('M', o.getInisial());
	}

}
