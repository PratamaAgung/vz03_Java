package cage;

import java.util.Vector;

/**
 * @class CageHandler berfungsi memanage cage.
 * @author Pratamamia Agung Prihatmaja.
 */

public class CageHandler {
  private int nbCage;
  private Vector<Cage> cageList;

  public CageHandler() {
    cageList = new Vector<Cage>();
    nbCage = 0;
  }

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

  public int getNbCage() {
    return nbCage;
  }

  public void addCage(Cage cage) {
    cageList.addElement(cage);
    nbCage++;
  }
}