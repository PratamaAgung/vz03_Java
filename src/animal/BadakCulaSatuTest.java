package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadakCulaSatuTest {

	@Test
	public void testBadakCulaSatu() {
		BadakCulaSatu badak = new BadakCulaSatu(1, 10, 1, 100, true);
		assertEquals(0, badak.getJmlMakanan());
		assertEquals(1, badak.getID());
		assertEquals(true, badak.isJinak());
		assertEquals(10, badak.getPosisiX());
		assertEquals(1, badak.getPosisiY());
		assertEquals('C', badak.getInisial());
	}

}
