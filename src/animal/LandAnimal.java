package animal;

/** 
 * @class LandAnimal turunan dari kelas Animal.
   menunjukkan animal yang tinggal di darat.
 * @author Annisa Muzdalifa.
 */
public abstract class LandAnimal extends Animal {
  /**
   * Contsructor.
   * @param inisial inisial dari animal yang diciptakan.
   * @param id id animal yang diciptakan.
   */
  public LandAnimal(char inisial, int id) {
    super(inisial,id);
    super.addHabitat('x');
  }
}