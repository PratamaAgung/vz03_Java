package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarimauSumatraTest {

  @Test
  public void testHarimauSumatra() {
    HarimauSumatra o = new HarimauSumatra(1, 10, 1, 100, true);

    assertEquals(8, o.getJmlMakanan());
    assertEquals(1, o.getId());
    assertEquals(true, o.isJinak());
    assertEquals(10, o.getPosisiX());
    assertEquals(1, o.getPosisiY());
    assertEquals('H', o.getInisial());  
  }

}
