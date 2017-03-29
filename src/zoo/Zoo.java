package zoo;

import cell.Cell;
import java.util.Vector;

/**
 * @author Pratamamia Agung Prihatmaja.
 */
public class Zoo {
  private final int width;
  private final int length;
  private Cell[][] cellArray;
  private Vector<Cell> entrance;
  private Vector<Cell> exit;
  
  /**
   * Constructor.
   * @param lebar lebar dari virtual zoo.
   * @param panjang panjang dari virtual zoo.
   */
  public Zoo(int lebar, int panjang) {
    width = lebar;
    length = panjang;
    cellArray = new Cell[length][width];
    exit = new Vector<Cell>(25);
    entrance = new Vector<Cell>(25);
  }
  
  /**
   * Setter untuk data member cell..
   * @param absis posisi absis dari cell.
   * @param ordinat posisi ordinat dari cell.
   * @param cell cell yang akan dimasukkan dalam posisi.
   */
  public void setCell(int absis, int ordinat, Cell cell) {
    cellArray[ordinat][absis] = cell;
  }
  
  /**
   * Getter untuk data member cell.
   * @param absis posisi absis dari cell.
   * @param ordinat posisi ordinat dari cell.
   * @return cell yang berada pada posisi tersebut.
   */
  public Cell getCell(int absis, int ordinat) {
    return cellArray[ordinat][absis];
  }
  
  /**
   * Getter untuk data member width.
   * @return lebar dari zoo.
   */
  public int getWidth() {
    return width;
  }
  
  /**
   * Getter untuk data member length.
   * @return panjang dari virtual zoo.
   */
  public int getLength() {
    return length;
  }
  
  /**
   * Method untuk menambahkan entrance.
   * @param enter cell entrance yang akan dimasukkan.
   */
  public void addEntrance(Cell enter) {
    entrance.addElement(enter);
  }
  
  /**
   * Meethod untuk menambahkan exit.
   * @param ex exit yang akan ditambahkan.
   */
  public void addExit(Cell ex) {
    exit.addElement(ex);
  }
  
  /**
   * Getter untuk elemen entrance.
   * @param idx indeks dari entrance.
   * @return entrance pada indeks tersebut.
   */
  public Cell getEntrance(int idx) {
    return entrance.get(idx);
  }
  
  /**
   * Getter untuk elemen exit.
   * @param idx indeks untuk exit.
   * @return exit yang berada pada indeks tersebut.
   */
  public Cell getExit(int idx) {
    return exit.get(idx);
  }
  
  /**
   * Method untuk mendapatkan banyak entrance yang ada.
   * @return banyak entrance pada zoo.
   */
  public int nbEntrance() {
    return entrance.size();
  }
  
  /**
   * Method untuk mendaptkan banyak exit pada zoo.
   * @return banyak exit pada zoo.
   */
  public int nbExit() {
    return exit.size();
  }
}
