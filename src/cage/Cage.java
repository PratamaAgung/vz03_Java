package cage;

import animal.*;
import java.util.*;

/**
 * @class Cage berfungsi sebagai tempat menyimpan animal.
 * @author Pratamamia Agung Prihatmaja.
 */

public class Cage {
  private int luas;
  private final int id;
  private final char habitat;
  private Vector<Animal> animal;
  
  public Cage(int nomor, char habitat1) {
    animal = new Vector();
    id = nomor;
    habitat = habitat1;
  }
  
  public void addAnimal(Animal animal) {
    animal.addElement(animal); 
  }
  
  public void addCell(char kar) {
    if (habitat == kar) {
      luas++;
    }
  }
  
  public int getId() {
    return id;
  }
  
  public int getLuas() {
    return luas;
  }
  
  public int getNbAnimal() {
    return animal.size();
  }
  
  public char getHabitat() {
    return habitat;
  }
  
  private boolean isAvailable() {
    return getNbAnimal() < (3 * luas/10);
  }
  
  private boolean isIsiJinak() {
    return true;
  }
}
