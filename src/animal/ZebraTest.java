package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZebraTest {

	@Test
	public void test() {
		Zebra o = new Zebra(1, 10, 1, 100, true);

		assertEquals(1, o.getJmlMakanan());
		assertEquals(1, o.getId());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
		assertEquals('Z', o.getInisial());
	}

}
