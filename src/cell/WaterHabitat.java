package cell;
 
/**
  * Kelas yang mewakili habitat air.
   * @author Pratamamia Agung Prihatmaja.
  */
public class WaterHabitat extends Habitat {
  
  /**
   * Konstruktor kelas WaterHabitat.
   * @param absis lokasi absis dari WaterHabitat.
   * @param ordinat lokasi ordinat dari kelas WaterHabitat.
   */
  public WaterHabitat(int absis, int ordinat) {
    super('w', absis, ordinat);
  }
}
