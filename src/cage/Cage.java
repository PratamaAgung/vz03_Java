package cage;

import animal.Animal;
import java.util.Vector;

/**
 * @class Cage berfungsi sebagai tempat menyimpan animal.
 * @author Pratamamia Agung Prihatmaja.
 */

public class Cage {
  private int luas;
  private final int id;
  private final char habitat;
  private Vector<Animal> animal;
  
  /**
   * Konstruktor kelas cage.
   * @param nomor nomor id untuk cage.
   * @param habitat1 habitat dari cage.
   */
  public Cage(int nomor, char habitat1) {
    animal = new Vector();
    id = nomor;
    habitat = habitat1;
  }
  
  /**
   * Methos untuk menambahkan animal ke cage.
   * @param animal1 animal yang akan ditambahkan.
   */
  public void addAnimal(Animal animal1) {
    animal.addElement(animal1); 
  }
  
  /**
   * Method untuk menambahkan cell ke cage.
   * @param kar habitat dari cell.
   */
  public void addCell(char kar) {
    if (habitat == kar) {
      luas++;
    }
  }
  
  /**
   * getter untuk data member id.
   * @return id dari cage.
   */
  public int getId() {
    return id;
  }
  
  /**
   * getter untuk data member luas.
   * @return luas dari cage.
   */
  public int getLuas() {
    return luas;
  }
  
  /**
   * getter untuk mendapatkan banyak animal pada cage.
   * @return banyak animal pada cage.
   */
  public int getNbAnimal() {
    return animal.size();
  }
  
  /**
   * getter untuk mendapatkan data member habitat.
   * @return habitat dari cell.
   */
  public char getHabitat() {
    return habitat;
  }
  
  /**
   * method untuk mengecek apakah kandang sudah penuh.
   * @return boolean kandang penuh.
   */
  private boolean isAvailable() {
    return getNbAnimal() < (3 * luas / 10);
  }
  
  /**
   * method untuk mengecek apakah isi dari cage jinak.
   * @return boolean apakah isi dari cage jinak.
   */
  private boolean isIsiJinak() {
    return true;
  }
}
