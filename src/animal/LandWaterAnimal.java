package animal;

/** 
 * @class LandWaterAnimal turunan dari kelas Animal.
   menunjukkan animal yang tinggal di darat dan di air (amphibi).
 * @author Iftitakhul Zakiah.
 */
public abstract class LandWaterAnimal extends Animal {
  /**
   * Constructor.
   * @param inisial inisial dari animal yang diciptakan.
   * @param id id animal yang diciptakan.
   */
  public LandWaterAnimal(char inisial, int id) {
    super(inisial,id);
    super.addHabitat('x');
  }
}