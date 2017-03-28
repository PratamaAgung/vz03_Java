package animal;
import java.util.*;

/**
 * @author Jehian Norman Saviero
 * @class AnimalHandler
 * kelas ini bertujuan untuk mengatur animal-animal pada virtual zoo secara keseluruhan
 */
public class AnimalHandler {
  private Vector<Animal> animal_list;

  /**
	* Constructor
	*/
  public AnimalHandler() {
	animal_list = new Vector<Animal> (50);
  }

  /**
	* Fungsi getAnimal bertujuan untuk mendapatkan animal dengan urutan id
	* @param id adalah nomer id dari animal yang dicari
	* @return Mengembalikan animal sesuai dengan id
	*/
  public Animal getAnimal(int idx) {
	return animal_list.get(idx);
  }
  
  /**
    * @return Mengembalikan banyaknya animal dalam virtual zoo
	*/
  public int nbAnimal() {
	return animal_list.size();
  }
  
  /**
	* Menambahkna animal a ke dalam virtual zoo
	* @param a merupakan animal yang akan dimasukkan ke dalam virtual zoo
	*/
  public void addAnimal(Animal a) {
	animal_list.addElement(a);
  }
  
  /**
	* @return Jumlah makanan dari semua animal yang ada pada virtual zoo dalam satuan gram
	*/
  public int jumlahMakanan() {
	int sum = 0;
	for(int i = 0; i < animal_list.size(); i++) {
	  sum += animal_list.get(i).getJmlMakanan();
	}
	return sum;
  }
}