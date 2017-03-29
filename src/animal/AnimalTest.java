package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

  @Test
  public void testAnimal() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    assertEquals('C', animal.getInisial());
    assertEquals(2, animal.getId());
  }

  @Test
  public void testSetJinak() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.setJinak(false);
    assertEquals(false, animal.isJinak());
  }

  @Test
  public void testSetMassa() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.setMassa(1000);
    assertEquals(1000, animal.getMassa());
  }

  @Test
  public void testSetMakanan() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.setMakanan(5);
    assertEquals(5, animal.getJmlMakanan());
  }

  @Test
  public void testSetX() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.setX(5);
    assertEquals(5, animal.getPosisiX());
  }

  @Test
  public void testSetY() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.setY(5);
    assertEquals(5, animal.getPosisiY());
  }

  @Test
  public void testAddHabitat() {
    Animal animal = new BadakCulaSatu(1, 10, 1, 100, true);
    animal.addHabitat('x');
    assertEquals("x", animal.getHabitat());
  }

}
