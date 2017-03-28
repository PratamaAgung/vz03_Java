package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void testAnimal() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		assertEquals('C', a.getInisial());
		assertEquals(2, a.getId());
	}

	@Test
	public void testSetJinak() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.setJinak(false);
		assertEquals(false, a.isJinak());
	}

	@Test
	public void testSetMassa() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.setMassa(1000);
		assertEquals(1000, a.getMassa());
	}

	@Test
	public void testSetMakanan() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.setMakanan(5);
		assertEquals(5, a.getJmlMakanan());
	}

	@Test
	public void testSetX() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.setX(5);
		assertEquals(5, a.getPosisiX());
	}

	@Test
	public void testSetY() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.setY(5);
		assertEquals(5, a.getPosisiY());
	}

	@Test
	public void testAddHabitat() {
		Animal a = new BadakCulaSatu(1, 10, 1, 100, true);
		a.addHabitat('x');
		assertEquals("x", a.getHabitat());
	}

}
