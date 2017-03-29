package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class KomodoTest {

  @Test
  public void testKomodo() {
    Komodo o = new Komodo(1, 10, 1, 100, true);

    assertEquals(10, o.getJmlMakanan());
    assertEquals(1, o.getId());
    assertEquals(true, o.isJinak());
    assertEquals(10, o.getPosisiX());
    assertEquals(1, o.getPosisiY());
    assertEquals('J', o.getInisial());
  }

}
