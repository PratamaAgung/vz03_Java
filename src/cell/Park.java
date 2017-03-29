package cell;

/**
 * @author Pratamamia Agung Prihatmaja.
 */

public class Park extends Facility {
  
  /**
   * Konstruktor.
   * @param absis lokasi absis dari Park.
   * @param ordinat lokasi ordinat dari park.
   */
  public Park(int absis, int ordinat) {
    super('*', absis, ordinat);
  }
  
  /**
   * Method untuk mencetak park ke layar.
   */
  public void render() {
    System.out.print("\u001B[34m" + type + "\u001B[0m");
  }
}
