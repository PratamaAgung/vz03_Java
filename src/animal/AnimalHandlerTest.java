package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalHandlerTest {

  @Test
  public void testAnimalHandler() {
    AnimalHandler a_handler = new AnimalHandler();
	assertEquals(0,a_handler.nbAnimal());
  }

  @Test
  public void testGetAnimal() {
	AnimalHandler a_handler = new AnimalHandler();
	Animal burung = new Garuda (1,10,1,100,true);
	a_handler.addAnimal(burung);
	assertEquals(burung,a_handler.getAnimal(0));
  }

  @Test
  public void testNbAnimal() {
	AnimalHandler a_handler = new AnimalHandler();
	Animal burung = new Garuda(1,10,1,100,true);
	Animal buaya = new Buaya(2,11,2,500,false);
	Animal banteng = new Banteng(3,3,9,1000,true);
	a_handler.addAnimal(burung);
	a_handler.addAnimal(buaya);
	a_handler.addAnimal(banteng);
	assertEquals(3,a_handler.nbAnimal());
  }

  @Test
  public void testJumlahMakanan() {
	AnimalHandler a_handler = new AnimalHandler();
	Animal burung = new Garuda(1,10,1,100,true);
	burung.setMakanan(1000);
	Animal buaya = new Buaya(2,11,2,500,false);
	buaya.setMakanan(2000);
	Animal banteng = new Banteng(3,3,9,1000,true);
	banteng.setMakanan(3000);
	int sum = 0;
	assertEquals(6000,a_handler.jumlahMakanan());
  }
}
