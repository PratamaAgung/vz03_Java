package cell;

/**
 * @author Pratamamia Agung Prihatmaja.
 */
public abstract class Facility extends Cell{
  
  /**
   * Konstruktor kelas facility.
   * @param kar type dari facility.
   * @param absis lokasi absis dari facility.
   * @param ordinat lokasi ordinat dari facility.
   */
  public Facility(char kar, int absis, int ordinat){
    super(kar, absis, ordinat);
  }
}
