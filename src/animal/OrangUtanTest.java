package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrangUtanTest {

	@Test
	public void testOrangUtan() {
		OrangUtan o = new OrangUtan(1, 10, 1, 100, true);

		assertEquals(6, o.getJmlMakanan());
		assertEquals(1, o.getId());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
	}

}
