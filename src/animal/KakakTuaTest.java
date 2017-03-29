package animal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @class KakakTuaTest.
 * KakakTuaTest adalah kelas yang digunakan untuk mengetes kelas KakakTua.
 * @author Iftitakhul Zakiah.
 */
public class KakakTuaTest {

  /**
   * Test method for {@link animal.KakakTua#KakakTua(int, int, int, int, boolean)}.
   */
  @Test
  public void testKakakTua() {
    KakakTua kakakTua = new KakakTua(1, 10, 1, 100, true);

      assertEquals(33, kakakTua.getJmlMakanan());
      assertEquals(1, kakakTua.getId());
      assertEquals(true, kakakTua.isJinak());
      assertEquals(10, kakakTua.getPosisiX());
      assertEquals(1, kakakTua.getPosisiY());
      assertEquals('P', kakakTua.getInisial());
  }

}
