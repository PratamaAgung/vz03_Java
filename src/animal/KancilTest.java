package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class KancilTest {

	@Test
	public void testKancil() {
		Kancil o = new Kancil(1, 10, 1, 100, true);
		  
		assertEquals(50, o.getJmlMakanan());
		assertEquals(1, o.getID());
		assertEquals(true, o.isJinak());
		assertEquals(10, o.getPosisiX());
		assertEquals(1, o.getPosisiY());
		assertEquals('K', o.getInisial());
	}

}
