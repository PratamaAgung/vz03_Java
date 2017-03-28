package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class RusaTest {

	@Test
	public void testRusa() {
		Rusa o = new Rusa(1, 10, 1, 100, true);

		assertEquals(5, o.getJmlMakanan());
		assertEquals(1, o.getID());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
		assertEquals('E', o.getInisial());
	}

}
