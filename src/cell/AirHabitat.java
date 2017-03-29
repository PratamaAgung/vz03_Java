package cell;

/**
 * Kelas yang merepresentasikan habitat udara.
 * @author Pratamamia Agung Prihatmaja.
 *
 */
public class AirHabitat extends Habitat {
  
  /**
   * Konstruktor kelas AirHabitat.
   * @param absis lokasi absis dari AirHabitat.
   * @param ordinat lokasi ordinat dari AirHabitat.
   */
  public AirHabitat(int absis, int ordinat) {
    super('o', absis, ordinat);
  }
}
