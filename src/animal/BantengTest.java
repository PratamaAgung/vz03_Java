package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BantengTest {

	@Test
	public void testBanteng() {
		Banteng banteng = new Banteng(1, 10, 1, 10, true);
		assertEquals(0, banteng.getJmlMakanan());
		assertEquals(1, banteng.getId());
		assertEquals(true, banteng.isJinak());
		assertEquals(10, banteng.getPosisiX());
		assertEquals(1, banteng.getPosisiY());
		assertEquals('A', banteng.getInisial());
	}

}
