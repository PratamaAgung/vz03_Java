package cage;

import java.util.Vector;

/**
 * @class CageHandler berfungsi memanage cage.
 * @author Pratamamia Agung Prihatmaja.
 */

public class CageHandler {
  private int nbCage;
  private Vector<Cage> cageList;

  /**
   * Konstruktor kelas cageHandler.
   */
  public CageHandler() {
    cageList = new Vector<Cage>();
    nbCage = 0;
  }

  /**
   * Getter untuk mendapatkan cage ber-id tertentu..
   * @param id id dari cage.
   * @return Cage dengan id.
   */
  public Cage getCage(int id) {
    boolean found = false;
    int i = 0;
    while ((!found) && (i < nbCage)) {
      if (cageList.elementAt(i).getId() == id) {
        found = true;
      } else {
        i++;
      }
    }
    if (found) {
      return cageList.elementAt(i);
    } else {
      return null;
    }
  }

  /**
   * Method untuk mendapatkan banyak cage.
   * @return banyak cage.
   */
  public int getNbCage() {
    return nbCage;
  }

  /**
   * Method untuk menambahkan cage.
   * @param cage Cage yang akan ditambahkan.
   */
  public void addCage(Cage cage) {
    cageList.addElement(cage);
    nbCage++;
  }
}