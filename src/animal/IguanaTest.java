package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class IguanaTest {

	@Test
	public void testIguana() {
		Iguana o = new Iguana(1, 10, 1, 100, true);

		assertEquals(12, o.getJmlMakanan());
		assertEquals(1, o.getId());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
		assertEquals('I', o.getInisial());
	}

}
