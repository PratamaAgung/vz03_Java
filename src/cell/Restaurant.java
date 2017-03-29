package cell;

/**
 * @author Pratamamia Agung Prihatmaja.
 */

public class Restaurant extends Facility {
  
  /**
   * Konstruktor.
   * @param absis lokasi absis dari Restaurant.
   * @param ordinat lokasi ordinat dari Restaurant.
   */
  public Restaurant(int absis, int ordinat) {
    super('R', absis, ordinat);
  }
  
  /**
   * Method untuk mencetak restaurant ke layar.
   */
  public void render() {
    System.out.print("\u001B[34m" + type + "\u001B[0m");
  }
}
