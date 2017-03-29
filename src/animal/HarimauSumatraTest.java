package animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HarimauSumatraTest {

  @Test
  public void testHarimauSumatra() {
    HarimauSumatra harimau = new HarimauSumatra(1, 10, 1, 100, true);

    assertEquals(8, harimau.getJmlMakanan());
    assertEquals(1, harimau.getId());
    assertEquals(true, harimau.isJinak());
    assertEquals(10, harimau.getPosisiX());
    assertEquals(1, harimau.getPosisiY());
    assertEquals('H', harimau.getInisial());  
  }

}
