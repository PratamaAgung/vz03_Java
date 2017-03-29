package cell;

import animal.*;
import cage.Cage;
import renderable.Renderable;

/**
 * @author Pratamamia Agung Prihatmaja.
 */

public abstract class Cell implements Renderable {
  protected Cage cage;
  protected Animal animal;
  protected final char type;
  protected final int absis;
  protected final int ordinat;
  
  /**
   * Konstruktor.
   * @param kar type dari cell.
   * @param sumbuX lokasi absis dari cell.
   * @param sumbuY lokasi ordinat dari cell.
   */
  public Cell(char kar, int sumbuX, int sumbuY) {
    type = kar;
    absis = sumbuX;
    ordinat = sumbuX;
    cage = null;
    animal = null;
  }
  
  /**
   * Getter dari data atribut type.
   * @return type dari cell.
   */
  public char getType() {
    return type;
  }
  
  /**
   * Getter dari data atribut cage.
   * @return cage yang melingkupi cell.
   */
  public Cage getCage() {
    return cage;
  }
  
  /**
   * Setter dari data aribut cage.
   * @param cage1 cage yang melingkupi cell.
   */
  public void setCage(Cage cage1) {
    cage = cage1;
  }
  
  /**
   * Getter dari data atribut animal.
   * @return animal yang berada pada cell.
   */
  public Animal getAnimal() {
    return animal;
  }
  
  /**
   * Setter dari data atribut animal.
   * @param hewan animal yang berada pada cell.
   */
  public void setAnimal(Animal hewan) {
    animal = hewan;
  }
  
  /**
   * Penghapus dari keberadaan animal pada suatu cell.
   */
  public void eraseAnimal() {
    animal = null;
  }
  
  /**
   * Getter dari data atribut absis.
   * @return lokasi absis dari cell.
   */
  public int getAbsis() {
    return absis;
  }
  
  /**
   * Getter dari data atribut ordinat.
   * @return lokasi ordinat dari cell.
   */
  public int getOrdinat() {
    return ordinat;
  }
  
  /**
   * Method untuk mencetak isi cell ke layar.
   */
  public void render() {
    System.out.print(type);
  }
}
