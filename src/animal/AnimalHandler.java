package animal;

import java.util.Vector;

/**
 * @author Jehian Norman Saviero.
 * @class AnimalHandler.
   kelas ini bertujuan untuk mengatur animal-animal pada virtual zoo secara keseluruhan.
 */
public class AnimalHandler {
  private Vector<Animal> animalList;

  /**
  * Constructor.
  */
  public AnimalHandler() {
    animalList = new Vector<Animal>(50);
  }

  /**
  * Fungsi getAnimal bertujuan untuk mendapatkan animal dengan urutan id.
  * @param idx adalah nomer idx dari animal yang dicari.
  * @return Mengembalikan animal sesuai dengan idx.
  */
  public Animal getAnimal(int idx) {
    return animalList.get(idx);
  }
  
  /**
    * @return Mengembalikan banyaknya animal dalam virtual zoo.
  */
  public int nbAnimal() {
    return animalList.size();
  }
  
  /**
  * Menambahkna animal1 ke dalam virtual zoo.
  * @param animal1 merupakan animal yang akan dimasukkan ke dalam virtual zoo.
  */
  public void addAnimal(Animal animal1) {
    animalList.addElement(animal1);
  }
  
  /**
  * @return Jumlah makanan dari semua animal yang ada pada virtual zoo dalam satuan gram.
  */
  public int jumlahMakanan() {
    int sum = 0;
    for (int i = 0; i < animalList.size(); i++) {
      sum += animalList.get(i).getJmlMakanan();
    }
    return sum;
  }
}