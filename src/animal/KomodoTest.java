package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KomodoTest {

  @Test
  public void testKomodo() {
    Komodo komodo = new Komodo(1, 10, 1, 100, true);
    assertEquals(10, komodo.getJmlMakanan());
    assertEquals(1, komodo.getId());
    assertEquals(true, komodo.isJinak());
    assertEquals(10, komodo.getPosisiX());
    assertEquals(1, komodo.getPosisiY());
    assertEquals('J', komodo.getInisial());
  }
}
